package com.epam.hotelbooking.entity;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Apartment implements Serializable {

    private static final long serialVersionUID = -8696104173112695592L;

    @Expose
    private String id;
    @Expose
    private ApartmentClass apartmentClass;
    @Expose
    private String status;

    public Apartment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApartmentClass getApartmentClass() {
        return apartmentClass;
    }

    public void setApartmentClass(ApartmentClass apartmentClass) {
        this.apartmentClass = apartmentClass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + id + '\'' +
                ", apartmentClass=" + apartmentClass +
                ", status='" + status + '\'' +
                '}';
    }
}