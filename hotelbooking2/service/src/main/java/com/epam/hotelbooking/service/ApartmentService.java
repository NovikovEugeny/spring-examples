package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.service.exception.ValidatorException;

import java.util.List;

public interface ApartmentService {

    List<Apartment> findAll();

    List<Apartment> findAllFree();

    List<Apartment> findFreeByClass(String className);

    List<Apartment> findFreeByRoomQuantity(int roomQuantity) throws ValidatorException;

    void save(Apartment apartment);

    Apartment findById(String id);

    void remove(String id);

}