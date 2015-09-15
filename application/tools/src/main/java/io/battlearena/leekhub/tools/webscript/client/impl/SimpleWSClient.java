/**
 * 
 */
package io.battlearena.leekhub.tools.webscript.client.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
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
import io.battlearena.leekhub.tools.webscript.client.IWSClient;

/**
 * @author leperrin
 *
 */
public class SimpleWSClient implements IWSClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleWSClient.class);
	
	private static final int TIMEOUT = 60;
	private static final String CHARSET = "UTF-8";

	/**
	 * @throws WebScriptException 
	 * @throws IOException 
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#get(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse get(final URL address, final IWSQuery query) throws WebScriptException {
		HttpURLConnection connexion = null;
		IWSResponse response = null;
		try {
			connexion = openConnexion(address, HTTPVerb.GET);
		} catch (IOException e) {
				LOGGER.error("Impossible de se connecter au webscript {}", address.toString(), e);
			throw new WebScriptException("Impossible de se connecter au webscript: " + address.toString(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#post(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse post(final URL address, final IWSQuery query) throws WebScriptException {
		HttpURLConnection connexion = null;
		IWSResponse response = null;
		try {
			connexion = openConnexion(address, HTTPVerb.POST);
		} catch (IOException e) {
				LOGGER.error("Impossible de se connecter au webscript {}", address.toString(), e);
			throw new WebScriptException("Impossible de se connecter au webscript: " + address.toString(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#delete(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse delete(final URL address, final IWSQuery query) throws WebScriptException {
		HttpURLConnection connexion = null;
		IWSResponse response = null;
		try {
			connexion = openConnexion(address, HTTPVerb.DELETE);
		} catch (IOException e) {
				LOGGER.error("Impossible de se connecter au webscript {}", address.toString(), e);
			throw new WebScriptException("Impossible de se connecter au webscript: " + address.toString(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
	}

	/**
	 * @see io.battlearena.leekhub.tools.webscript.client.IWSClient#put(java.net.URL, io.battlearena.leekhub.model.webscript.query.IWSQuery)
	 */
	@Override
	public IWSResponse put(final URL address, final IWSQuery query) throws WebScriptException {
		HttpURLConnection connexion = null;
		IWSResponse response = null;
		try {
			connexion = openConnexion(address, HTTPVerb.PUT);
		} catch (IOException e) {
				LOGGER.error("Impossible de se connecter au webscript {}", address.toString(), e);
			throw new WebScriptException("Impossible de se connecter au webscript: " + address.toString(), e);
		} finally {
			if (null != connexion) {
				closeConnexion(connexion);
			}
		}
		return response;
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
	
	protected void closeConnexion(HttpURLConnection connexion) {
		connexion.disconnect();
	}
	

}
