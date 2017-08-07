package com.epam.hotelbooking.util;

import com.epam.hotelbooking.service.ApartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private final static AppContext INSTANCE = new AppContext();

    private ApartmentService apartmentService;

    public static AppContext getInstance() {
        return INSTANCE;
    }

    public void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        apartmentService = context.getBean(ApartmentService.class);
    }

    public ApartmentService getApartmentService() {
        return apartmentService;
    }
}