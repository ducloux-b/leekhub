package io.battlearena.leekhub.model.webscript.response;

public abstract class IWSResponse<T> {
	
	protected int code;

	/**
	 * Setter pour le code HTTP retourné au WS
	 * @param responseCode le code HTTP
	 */
	public void setCode(int responseCode) {
		this.code = responseCode;
	}
	
	public abstract Class<T> getResponseType();
	
	public abstract void setResponseValue(T resonseValue);
	

}
