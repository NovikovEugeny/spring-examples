package com.epam.hotelbooking.listener;

import com.epam.hotelbooking.util.AppContext;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        AppContext.getInstance().init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}