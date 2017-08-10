package com.epam.hotelbooking.controller.command.impl;

import com.epam.hotelbooking.controller.command.Command;
import com.epam.hotelbooking.controller.command.util.JsonConverter;
import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.ApartmentService;
import com.epam.hotelbooking.util.AppContext;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ShowFreeApartmentsByClass implements Command {

    private final static String REF_SEQUENCE = "class/";
    private final static String SEPARATOR = "/";
    private final static int REF_LENGTH = 6;
    private final static char REPLACED_SYMBOL = '_';
    private final static char NEW_SYMBOL = ' ';

    private String getClassName(String uri) {
        return uri.substring(uri.indexOf(REF_SEQUENCE) + REF_LENGTH, uri.lastIndexOf(SEPARATOR)).replace(REPLACED_SYMBOL, NEW_SYMBOL);
    }

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ApartmentService apartmentService = AppContext.getInstance().getApartmentService();

        String className = getClassName(req.getRequestURI());
        List<Apartment> apartments = apartmentService.findFreeByClass(className);

        String json = JsonConverter.toJson(apartments);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println(json);
    }

}