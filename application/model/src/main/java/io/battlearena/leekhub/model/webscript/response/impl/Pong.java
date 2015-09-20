package io.battlearena.leekhub.model.webscript.response.impl;


import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public class Pong extends IWSResponse<String>{
	String text;

	@Override
	public Class<String> getResponseType() {
		return String.class;
	}

	@Override
	public void setResponseValue(String resonseValue) {
		this.text = resonseValue;
	}

	public String getText() {
		return text;
	}
}
