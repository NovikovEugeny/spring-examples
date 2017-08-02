package com.epam.hotelbooking.service.impl;

import com.epam.hotelbooking.entity.User;
import com.epam.hotelbooking.repository.RoomRepository;
import com.epam.hotelbooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;


    public User show(int id) {
        return roomRepository.show(id);
    }

}