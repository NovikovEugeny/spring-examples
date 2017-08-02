package com.epam.hotelbooking.service;

import com.epam.hotelbooking.repository.impl.RoomRepositoryImpl;
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        RoomRepositoryImpl roomRepository = context.getBean(RoomRepositoryImpl.class);

        System.out.println("service test");


        Gson gson = new Gson();

        String json = gson.toJson(roomRepository.show(1));
        System.out.println(json);
    }
}