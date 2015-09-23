package io.battlearena.leekhub.model.webscript.query.impl;

import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.impl.IdEquipe;

public class GetIdEquipe extends IWSQuery<String, IdEquipe> {

	public GetIdEquipe(String teamName, String teamPassword) {
		super(new IdEquipe(), "player/getIdEquipe/"+teamName+"/"+teamPassword, null, HTTPVerb.GET);
	}
}
