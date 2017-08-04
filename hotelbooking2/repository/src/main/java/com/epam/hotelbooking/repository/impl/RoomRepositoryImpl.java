package com.epam.hotelbooking.repository.impl;

import com.epam.hotelbooking.entity.Room;
import com.epam.hotelbooking.repository.RoomRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@SuppressWarnings("unchecked")
public class RoomRepositoryImpl implements RoomRepository {

    private final static String ROOM_STATUS_PROPERTY = "status";
    private final static String ROOM_STATUS_PROPERTY_VALUE = "free";

    @Autowired
    private SessionFactory sessionFactory;

    public List<Room> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Room.class).list();
    }

    public List<Room> findAllFree() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Room.class)
                .add(Restrictions.eq(ROOM_STATUS_PROPERTY, ROOM_STATUS_PROPERTY_VALUE))
                .list();
    }
}