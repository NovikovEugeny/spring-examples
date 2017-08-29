package com.epam.currencytimer.service;

import com.epam.currencytimer.entity.Dollar;
import com.epam.currencytimer.repository.DollarRepository;
import com.epam.currencytimer.service.exception.ChangingException;
import com.epam.currencytimer.service.exception.ExceptionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DollarServiceImpl implements DollarService {

    @Autowired
    private DollarRepository dollarRepository;

    @Override
    public List<Dollar> findAll() {
        return dollarRepository.findAll();
    }

    @Override
    public void deleteAll() {
        dollarRepository.deleteAll();
    }

    @Override
    public Dollar findLast() {
        List<Dollar> dollars = dollarRepository.findAll();
        int index = dollars.size() - 1;

        if (index == -1) {
            return null;
        }

        return dollarRepository.findAll().get(index);
    }

    @Override
    public void save(String value) throws ChangingException {
        double previousValue = 0;

        if (findLast() != null) {
            previousValue = findLast().getValue();
        }

        Dollar dollar = new Dollar();
        dollar.setValue(Double.parseDouble(value));
        dollar.setDate(new Date());

        dollarRepository.save(dollar);

        if (previousValue > 0) {
            if (dollar.getValue() > previousValue) {
                throw new ChangingException(ExceptionMessage.INCREASED + " " + dollar.getValue() +
                        " (+" + (dollar.getValue() - previousValue) + ")");
            }
            if (dollar.getValue() < previousValue) {
                throw new ChangingException(ExceptionMessage.DECREASED + " " + dollar.getValue() +
                        " (-" + (previousValue - dollar.getValue()) + ")");
            }
        }
    }



}