package com.epam.hotelbooking.controller.command.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverter {

    public static String toJson(Object object) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(object);
    }

}