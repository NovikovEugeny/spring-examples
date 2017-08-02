package com.epam.hotel.dao;

import com.epam.hotel.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Dao {


    private Session session;
    private Transaction tx;
    private SessionFactory sessionFactory;

    public User show(int id) {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        User user = (User) session.get(User.class, id);
        tx.commit();
        session.close();

        return user;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
