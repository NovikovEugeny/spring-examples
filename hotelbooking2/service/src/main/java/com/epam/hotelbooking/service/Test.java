package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    private static boolean test(String regExp, String str) {
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    private static String toJson(Object object) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(object);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ApartmentService apartmentService = context.getBean(ApartmentService.class);



        for (Apartment apartment : apartmentService.findAll()) {
            System.out.println(apartment);
        }


    }
}