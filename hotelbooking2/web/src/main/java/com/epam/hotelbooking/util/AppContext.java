package com.epam.hotelbooking.util;

import com.epam.hotelbooking.service.RoomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private final static AppContext INSTANCE = new AppContext();

    private RoomService roomService;

    public static AppContext getInstance() {
        return INSTANCE;
    }

    public void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        roomService = context.getBean(RoomService.class);
    }

    public RoomService getRoomService() {
        return roomService;
    }
}