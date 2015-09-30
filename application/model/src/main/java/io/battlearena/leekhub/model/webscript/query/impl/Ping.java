package io.battlearena.leekhub.model.webscript.query.impl;

import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.impl.Pong;

public class Ping extends IWSQuery<String, Pong> {

	public Ping() {
		super(new Pong(), "ping", null, HTTPVerb.GET);
	}
}
