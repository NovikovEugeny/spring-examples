package com.epam.hotelbooking.service.impl;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.repository.ApartmentRepository;
import com.epam.hotelbooking.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    public List<Apartment> findAll() {
        return apartmentRepository.findAll();
    }

    public List<Apartment> findAllFree() {
        return apartmentRepository.findAllFree();
    }

    public List<Apartment> findFreeByClass(String className) {
        return apartmentRepository.findFreeByClass(className);
    }

    public List<Apartment> findFreeByRoomQuantity(int roomQuantity) {
        return apartmentRepository.findFreeByRoomQuantity(roomQuantity);
    }

    public void save(Apartment apartment) {
        apartmentRepository.save(apartment);
    }

    public Apartment findById(String id) {
        return apartmentRepository.findById(id);
    }

}