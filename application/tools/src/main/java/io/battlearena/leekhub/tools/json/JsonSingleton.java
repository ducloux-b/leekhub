package io.battlearena.leekhub.tools.json;


import com.google.gson.Gson;

import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public enum JsonSingleton {
	INSTANCE;
	
	private final static Gson gson = new Gson();
	
	public <T> String jsonise(T element) {
		return gson.toJson(element);
		
	}
	public <T> IWSResponse dejsonise(String element, Class<T> clazz) {
		return gson.fromJson(element, clazz);
	}
	

}
