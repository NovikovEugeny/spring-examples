package com.epam.hotelbooking.controller.command.impl;

import com.epam.hotelbooking.controller.command.Command;
import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.ApartmentService;
import com.epam.hotelbooking.util.AppContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowFreeApartments implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApartmentService apartmentService = AppContext.getInstance().getApartmentService();
        List<Apartment> apartments = apartmentService.findAllFree();

        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }
}