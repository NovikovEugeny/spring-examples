package com.epam.hotelbooking.controller;

import com.epam.hotelbooking.controller.command.Command;
import com.epam.hotelbooking.controller.command.CommandProvider;
import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommandProvider commandProvider = CommandProvider.getInstance();

        Command command = commandProvider.getCommand(req.getRequestURI());
        command.execute(req, resp);
    }
}