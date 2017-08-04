package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Room;
import com.epam.hotelbooking.repository.RoomRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        RoomService roomService = context.getBean(RoomService.class);

        for (Room room : roomService.findAll()) {
            System.out.println(room);
        }
    }
}
