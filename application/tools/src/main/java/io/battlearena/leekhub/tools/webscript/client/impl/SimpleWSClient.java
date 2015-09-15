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
import java.net.URL;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.apache.commons.lang3.StringUtils;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;
import io.battlearena.leekhub.tools.json.JsonSingleton;
import io.battlearena.leekhub.tools.webscript.client.IWSClient;

/**
 * @author leperrin
 *
 */
public class SimpleWSClient implements IWSClient {
	
	private static final int TIMEOUT = 60;
	private static final String CHARSET = "UTF-8";

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#get(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse get(final URL address, final IWSQuery query) throws WebScriptException {
		return anyVerb(address, query, HTTPVerb.GET);
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#post(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse post(final URL address, final IWSQuery query) throws WebScriptException {
		return anyVerb(address, query, HTTPVerb.POST);
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#delete(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse delete(final URL address, final IWSQuery query) throws WebScriptException {
		return anyVerb(address, query, HTTPVerb.DELETE);
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#put(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse put(final URL address, final IWSQuery query) throws WebScriptException {
		return anyVerb(address, query, HTTPVerb.PUT);
	}
	
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
	protected IWSResponse anyVerb(final URL address, final IWSQuery query, HTTPVerb verb) throws WebScriptException {
		HttpURLConnection connexion = null;
		IWSResponse response = null;
		try {
			connexion = openConnexion(address, verb);
			connexion.setDoOutput(true);
			connexion.setRequestProperty("Content-Type", "application/json");
			final OutputStream webscriptStream = connexion.getOutputStream();
			final String input = JsonSingleton.INSTANCE.jsonise(query);
			webscriptStream.write(input.getBytes(CHARSET));
			webscriptStream.flush();
			response = JsonSingleton.INSTANCE.dejsonise(inputStreamToString(connexion.getInputStream()), IWSResponse.class);     
			response.setCode(connexion.getResponseCode());
		} catch (IOException e) {
			throw new WebScriptException("Impossible de se connecter au webscript: " + address.toString(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
	}
}
