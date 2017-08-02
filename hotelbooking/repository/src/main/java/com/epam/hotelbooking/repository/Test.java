package com.epam.hotelbooking.repository;

import com.epam.hotelbooking.repository.impl.RoomRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        RoomRepositoryImpl roomRepository = context.getBean(RoomRepositoryImpl.class);

        System.out.println("repository test");
        System.out.println(roomRepository.show(1));


    }
}
