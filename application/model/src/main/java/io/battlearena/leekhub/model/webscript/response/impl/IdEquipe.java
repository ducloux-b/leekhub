package io.battlearena.leekhub.model.webscript.response.impl;

import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public class IdEquipe extends IWSResponse<String> {
	
	private String idEquipe;

	@Override
	public Class<String> getResponseType() {
		return String.class;
	}

	@Override
	public void setResponseValue(String resonseValue) {
		this.idEquipe = resonseValue;
	}

	public String getIdEquipe() {
		return idEquipe;
	}

}
