package com.epam.currencytimer.controller;

import com.epam.currencytimer.entity.Dollar;
import com.epam.currencytimer.service.DollarService;
import com.epam.currencytimer.service.exception.ChangingException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    private static final Logger LOGGER = Logger.getLogger(AppController.class);

    @Autowired
    private DollarService dollarService;

    @GetMapping("/start")
    @ResponseStatus(HttpStatus.OK)
    public void startApp() {
        LOGGER.info("application was started!!!");
    }

    @GetMapping("/stop")
    @ResponseStatus(HttpStatus.OK)
    public void stopApp() {
        LOGGER.info("application was stopped!!!");
    }

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.OK)
    public void send(@RequestParam String value) throws ChangingException {
        LOGGER.info(value);
        dollarService.save(value);
    }

    @GetMapping("/get")
    @ResponseBody
    public String getLastValue() {
        return Double.toString(dollarService.findLast().getValue());
    }

    @GetMapping("/get-all")
    @ResponseBody
    public List<Dollar> getStatistics() {
        return dollarService.findAll();
    }

    @PostMapping("/clear")
    @ResponseStatus(HttpStatus.OK)
    public void clear() {
        dollarService.deleteAll();
    }

}