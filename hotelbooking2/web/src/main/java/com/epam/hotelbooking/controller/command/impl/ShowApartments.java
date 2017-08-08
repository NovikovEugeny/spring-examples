package com.epam.hotelbooking.controller.command.impl;

import com.epam.hotelbooking.controller.command.Command;
import com.epam.hotelbooking.controller.command.util.JsonConverter;
import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.ApartmentService;
import com.epam.hotelbooking.util.AppContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ShowApartments implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApartmentService apartmentService = AppContext.getInstance().getApartmentService();
        List<Apartment> apartments = apartmentService.findAll();

        String json = JsonConverter.toJson(apartments);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println(json);
    }
}