package com.epam.hotelbooking.controller.command.impl;

import com.epam.hotelbooking.controller.command.Command;
import com.epam.hotelbooking.controller.command.util.JsonConverter;
import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.ApartmentService;
import com.epam.hotelbooking.service.exception.ValidatorException;
import com.epam.hotelbooking.util.AppContext;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ShowFreeApartmentsByRoomQuantity implements Command {

    private final static String REF_SEQUENCE = "room_quantity/";
    private final static String SEPARATOR = "/";
    private final static int REF_LENGTH = 14;

    private static final Logger LOGGER = Logger.getLogger(ShowFreeApartmentsByRoomQuantity.class);

    private int getRoomQuantity(String uri) {
        return Integer.parseInt(uri.substring(uri.indexOf(REF_SEQUENCE) + REF_LENGTH, uri.lastIndexOf(SEPARATOR)));
    }

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            ApartmentService apartmentService = AppContext.getInstance().getApartmentService();

            int roomQuantity = getRoomQuantity(req.getRequestURI());
            List<Apartment> apartments = apartmentService.findFreeByRoomQuantity(roomQuantity);

            String json = JsonConverter.toJson(apartments);

            PrintWriter printWriter = resp.getWriter();
            printWriter.println(json);

        } catch (ValidatorException exc) {
            LOGGER.error("room quantity can not be negative or zero");
        }
    }

}