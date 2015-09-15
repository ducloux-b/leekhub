package io.battlearena.leekhub.tools.webscript.client;

import java.net.URL;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public interface IWSClient {
	/**
	 * Envoyer une requete avec le verbe GET et recuperer la reponse
	 * @param address l'adresse � laquelle la requete doit �tre envoy�e
	 * @param query �l�ments � envoyer pour param�trer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse get(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe POST et recuperer la reponse
	 * @param address l'adresse � laquelle la requete doit �tre envoy�e
	 * @param query �l�ments � envoyer pour param�trer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse post(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe DELETE et recuperer la reponse
	 * @param address l'adresse � laquelle la requete doit �tre envoy�e
	 * @param query �l�ments � envoyer pour param�trer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse delete(final URL address, final IWSQuery query) throws WebScriptException;
	/**
	 * Envoyer une requete avec le verbe PUT et recuperer la reponse
	 * @param address l'adresse � laquelle la requete doit �tre envoy�e
	 * @param query �l�ments � envoyer pour param�trer la requete
	 * @return La reponse du Webscript.
	 */
	IWSResponse put(final URL address, final IWSQuery query) throws WebScriptException;
}
