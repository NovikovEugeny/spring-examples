package com.epam.hotelbooking.entity;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Set;

public class ApartmentClass implements Serializable {

    private static final long serialVersionUID = 5188951036374731519L;

    @Expose
    private String className;
    @Expose
    private int roomQuantity;
    @Expose
    private double cost;

    private Set<Apartment> apartments;

    public ApartmentClass() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Set<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(Set<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "ApartmentClass{" +
                "className='" + className + '\'' +
                ", roomQuantity=" + roomQuantity +
                ", cost=" + cost +
                '}';
    }
}