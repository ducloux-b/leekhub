package io.battlearena.leekhub.tools.json;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JsonModem <T> implements JsonSerializer<T>, JsonDeserializer<T> {

    /**
     * Implementation of the object represented in JSON.
     */
    private Class<?> implementation;

    /**
     * Constructor.
     * 
     * @param pImplementation
     *            Class of implementation.
     */
    public JsonModem(Class<?> pImplementation) {
        implementation = pImplementation;
    }

    /**
     * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type,
     *      com.google.gson.JsonDeserializationContext)
     */
    @Override
    public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        return context.deserialize(json, implementation);
    }

    /**
     * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type,
     *      com.google.gson.JsonSerializationContext)
     */
    @Override
    public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }

}
