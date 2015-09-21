package io.battlearena.leekhub.model.webscript.query.impl;

import io.battlearena.leekhub.model.webscript.query.ContentQuery;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;

public class GetIdEquipe implements IWSQuery {
	private String teamName;
	private String teamPassword;
	
	
	
	public GetIdEquipe(String teamName, String teamPassword) {
		super();
		this.teamName = teamName;
		this.teamPassword = teamPassword;
	}
	
	@Override
	public String getRessource() {
		return "player/getIdEquipe/"+teamName+"/"+teamPassword;
	}
	@Override
	public ContentQuery getContentParams() {
		return null;
	}
	
	
}
