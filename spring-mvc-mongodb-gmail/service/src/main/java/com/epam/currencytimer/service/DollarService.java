package com.epam.currencytimer.service;

import com.epam.currencytimer.entity.Dollar;
import com.epam.currencytimer.service.exception.ChangingException;

import java.util.List;

public interface DollarService {

    List<Dollar> findAll();

    void deleteAll();

    Dollar findLast();

    void save(String value) throws ChangingException;

}