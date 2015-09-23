package io.battlearena.leekhub.tools.webscript.client;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public interface IWSClient<Q extends IWSQuery<?, ? extends IWSResponse<?>>, R> {
	/**
	 * Envoyer une requete recupere la reponse
	 * @param address l'adresse à laquelle la requete doit être envoyée
	 * @param query éléments à envoyer pour paramètrer la requete
	 * @return La reponse du Webscript.
	 */
	public IWSResponse<R> call(final Q query) throws WebScriptException;
}
