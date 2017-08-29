package com.epam.currencytimer.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "dollars")
public class Dollar implements Serializable {

    private double value;
    private Date date;

    public Dollar() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "value=" + value +
                ", date=" + date +
                '}' + '\n';
    }
}
