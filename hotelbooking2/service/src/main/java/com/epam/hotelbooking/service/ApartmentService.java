package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;

import java.util.List;

public interface ApartmentService {

    List<Apartment> findAll();

    List<Apartment> findAllFree();

    List<Apartment> findFreeByClass(String className);

    List<Apartment> findFreeByRoomQuantity(int roomQuantity);

}