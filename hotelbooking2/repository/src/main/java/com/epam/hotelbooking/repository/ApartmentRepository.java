package com.epam.hotelbooking.repository;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.entity.ApartmentClass;

import java.util.List;

public interface ApartmentRepository {

    List<Apartment> findAll();

    List<Apartment> findAllFree();

    List<Apartment> findFreeByClass(String className);

    List<Apartment> findFreeByRoomQuantity(int roomQuantity);

    void save(Apartment apartment);

    Apartment findById(String id);

}