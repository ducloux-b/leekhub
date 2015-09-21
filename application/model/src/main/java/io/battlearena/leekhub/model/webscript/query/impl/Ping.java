package io.battlearena.leekhub.model.webscript.query.impl;

import io.battlearena.leekhub.model.webscript.query.ContentQuery;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;

public class Ping implements IWSQuery {


	@Override
	public ContentQuery getContentParams() {
		return null;
	}

	@Override
	public String getRessource() {
		return "ping";
	}
}
