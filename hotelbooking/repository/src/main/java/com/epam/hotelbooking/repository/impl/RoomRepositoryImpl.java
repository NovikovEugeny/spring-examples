package com.epam.hotelbooking.repository.impl;

import com.epam.hotelbooking.entity.User;
import com.epam.hotelbooking.repository.RoomRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public User show(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = (User) session.get(User.class, id);
        transaction.commit();
        session.close();
        return user;
    }
}
