package com.epam.hotelbooking.repository;

import com.epam.hotelbooking.entity.Room;

import java.util.List;

public interface RoomRepository {

    List<Room> findAll();

    List<Room> findAllFree();

}