package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    List<Room> findAllFree();

}