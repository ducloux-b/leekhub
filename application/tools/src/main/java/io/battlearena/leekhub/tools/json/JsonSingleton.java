package io.battlearena.leekhub.tools.json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.battlearena.leekhub.model.webscript.response.impl.Pong;

public enum JsonSingleton {
	INSTANCE;

	private final static JsonModem<String> pongModem = new JsonModem<>(Pong.class);
	private final static Gson gson = new GsonBuilder()
			.registerTypeAdapter(Pong.class, pongModem)
			.create();
	
	public <T> String jsonise(T element) {
		return gson.toJson(element);
		
	}
	public <T> T dejsonise(String element, Class<T> clazz) {
		return gson.fromJson(element, clazz);
	}
	

}
