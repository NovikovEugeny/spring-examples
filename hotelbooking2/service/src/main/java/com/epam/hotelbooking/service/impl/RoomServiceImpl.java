package com.epam.hotelbooking.service.impl;

import com.epam.hotelbooking.entity.Room;
import com.epam.hotelbooking.repository.RoomRepository;
import com.epam.hotelbooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public List<Room> findAllFree() {
        return roomRepository.findAllFree();
    }
}