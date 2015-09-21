package io.battlearena.leekhub.tools.webscript.client;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public interface IWSClient<Q extends IWSQuery, R> {
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse<R> get(final Q query, String responseClassName) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse<R> post(final Q query, String responseClassName) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse<R> delete(final Q query, String responseClassName) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse<R> put(final Q query, String responseClassName) throws WebScriptException;
}
