package com.epam.hotelbooking.repository;

import com.epam.hotelbooking.entity.User;

public interface RoomRepository {

    User show(int id);

}