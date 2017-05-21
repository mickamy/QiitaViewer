package com.mickamy.qiitaviewer.factory;

import android.text.TextUtils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;

public class GsonFactory {

    public static Gson makeGson() {
        return new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeConverter())
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }

    private static final class OffsetDateTimeConverter implements JsonDeserializer<OffsetDateTime> {

        @Override
        public OffsetDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            String jsonString = json.getAsString();
            if (TextUtils.isEmpty(jsonString)) {
                return null;
            }
            return OffsetDateTime.parse(jsonString);
        }
    }
}
