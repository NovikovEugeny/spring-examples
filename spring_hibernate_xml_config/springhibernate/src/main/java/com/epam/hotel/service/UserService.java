package com.epam.hotel.service;

import com.epam.hotel.dao.Dao;
import com.epam.hotel.entity.User;


public class UserService {

    private Dao userDao;

    public void setUserDao(Dao userDao) {
        this.userDao = userDao;
    }

    public User show(int id) {
        return userDao.show(id);
    }


}