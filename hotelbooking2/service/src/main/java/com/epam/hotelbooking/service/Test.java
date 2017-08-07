package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    private static boolean test(String regExp, String str) {
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ApartmentService apartmentService = context.getBean(ApartmentService.class);

        for (Apartment apartment : apartmentService.findFreeByRoomQuantity(4)) {
            System.out.println(apartment);
        }*/

        String s = "/apartments/free/room_quantity/2/";
        System.out.println(s.substring(s.indexOf("room_quantity/") + 14, s.lastIndexOf("/")).length());

        /*Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        System.out.println(gson.toJson(apartments));*/


    }
}