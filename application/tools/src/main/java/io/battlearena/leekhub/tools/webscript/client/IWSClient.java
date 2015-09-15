package io.battlearena.leekhub.tools.webscript.client;

import java.net.URL;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public interface IWSClient {
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse get(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse post(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse delete(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse put(final URL address, final IWSQuery query) throws WebScriptException;
}
