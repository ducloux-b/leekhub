package io.battlearena.leekhub.model.webscript.query;

import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public abstract class IWSQuery<T,R extends IWSResponse<T>> {
	
	protected R response;
	protected String ressource;
	protected ContentQuery contentQuery;
	protected HTTPVerb verb;
	
	
	
	public IWSQuery(R response, String ressource, ContentQuery contentQuery, HTTPVerb verb) {
		super();
		this.response = response;
		this.ressource = ressource;
		this.contentQuery = contentQuery;
		this.verb = verb;
	}
	public String getRessource() {
		return ressource;
	}
	public ContentQuery getContentParams() {
		return contentQuery;
	}
	
	public R getResponse() {
		return this.response;
	}
	
	public void setResponse(R pResponse) {
		this.response = pResponse;
	}
	
	public HTTPVerb getVerb() {
		return verb;
	}
}
