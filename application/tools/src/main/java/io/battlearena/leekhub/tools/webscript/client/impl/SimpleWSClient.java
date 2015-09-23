/**
 * 
 */
package io.battlearena.leekhub.tools.webscript.client.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;
import io.battlearena.leekhub.tools.json.JsonSingleton;
import io.battlearena.leekhub.tools.webscript.client.IWSClient;

/**
 * 
 * @author Léo
 *
 * @param <Q> Query class
 * @param <R> Response class
 */
public class SimpleWSClient<Q extends IWSQuery<?, ? extends IWSResponse<R>>,R> implements IWSClient<Q, R> {

	private static final int TIMEOUT = 6000;
	private static final String CHARSET = "UTF-8";
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleWSClient.class);
	private String rootAdress = "http://battlearena.io/test-ws";


	/**
	 * Initialiser une connexion avec un web service
	 * @param address l'adresse du webservice
	 * @param verb le verbe HTTP avec lequel on appel le webservice
	 * @return une connexion
	 * @throws IOException en cas de problème de connexion
	 */
	protected HttpURLConnection openConnexion(final URL address, final HTTPVerb verb) throws IOException {
		return openConnexion(address, verb, null, null);
	}

	/**
	 * Initialiser une connexion avec un web service
	 * @param address l'adresse du webservice
	 * @param verb le verbe HTTP avec lequel on appel le webservice
	 * @param username le nom d'utilisateur pour se connecter au webservice
	 * @param password le mot de passe pour se connecter au webservice
	 * @return une connexion
	 * @throws IOException en cas de problème de connexion
	 */
	protected HttpURLConnection openConnexion(final URL address, final HTTPVerb verb, final String username, final String password) throws IOException {
		HttpURLConnection connexion = (HttpURLConnection) address.openConnection();
		connexion.setRequestMethod(verb.name());
		connexion.setConnectTimeout(TIMEOUT);
		connexion.setReadTimeout(TIMEOUT);
		if (StringUtils.isNotBlank(username) || StringUtils.isNotBlank(password)) {
			String localUsername = username;
			if (StringUtils.isBlank(localUsername)) {
				localUsername = "";
			}
			String localPassword = password;
			if (StringUtils.isBlank(localPassword)) {
				localPassword = "";
			}
			Encoder encoder = Base64.getEncoder();
			final String encodedCredential = encoder.encodeToString((localUsername + ":" + localPassword).getBytes(CHARSET));
			connexion.setRequestProperty("Authorization", "BASIC " + encodedCredential);
		}
		return connexion;
	}

	/**
	 * Cloturer une connexion avec un web service
	 * @param connexion la connexion à cloturer
	 */
	protected void closeConnexion(HttpURLConnection connexion) {
		connexion.disconnect();
	}

	/**
	 * Conversion d'un InputStream en String
	 * @param inputStream flux de text
	 * @return String
	 * @throws WebScriptException 
	 */
	protected String inputStreamToString(final InputStream inputStream) throws WebScriptException {
		BufferedReader br = null;
		StringBuilder output = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(inputStream, CHARSET));
			String line;
			output = new StringBuilder();
			try {
				while ((line = br.readLine()) != null) {
					output.append(line);
				}
			} catch (IOException e) {
				throw new WebScriptException("Problème de lecture de la reponse", e);
			}
		} catch (UnsupportedEncodingException e) {
			throw new WebScriptException("Encodage non supporté: " + CHARSET, e);
		}
		return output.toString();
	}

	/**
	 * Methode qui effectue l'appel HTTP
	 * @param address l'adresse à interoger
	 * @param query le corps de la requete
	 * @param verb le verbe HTTP à utiliser
	 * @return Une reponse respectant l'interface IWSResponse
	 * @throws WebScriptException Les erreurs remontant de plus bas encapsulé et commenté
	 */
	@Override
	public IWSResponse<R> call(final Q query) throws WebScriptException {
		System.setProperty("http.proxyHost", "ntes.proxy.corp.sopra");
        System.setProperty("http.proxyPort", "8080");
        //System.setProperty("https.proxyHost", "ntes.proxy.corp.sopra");
        //System.setProperty("https.proxyPort", "8080");
		HttpURLConnection connexion = null;
		IWSResponse<R> response = query.getResponse();
		try {

			URL address = new URL(rootAdress  + "/" + query.getRessource());

			connexion = openConnexion(address, query.getVerb());

			if (query.getContentParams() != null) {
				final OutputStream webscriptStream = connexion.getOutputStream();
				connexion.setDoOutput(true);
				connexion.setRequestProperty("Content-Type", "application/json");
				System.err.println(query.getContentParams().getJsonizedContent());
				webscriptStream.write(query.getContentParams().getJsonizedContent().getBytes(CHARSET));
				webscriptStream.flush();
			}
			response.setResponseValue((R) JsonSingleton.INSTANCE.dejsonise(inputStreamToString(connexion.getInputStream()), response.getResponseType()));     
			response.setCode(connexion.getResponseCode());
		} catch (MalformedURLException e) {
			LOGGER.error("L'adresse {} n'est pas conforme ", rootAdress  + "/" + query.getRessource(),e);
		} catch (IOException e) {
			throw new WebScriptException("Impossible de se connecter au webscript: " + rootAdress  + "/" + query.getRessource(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
	}
}
