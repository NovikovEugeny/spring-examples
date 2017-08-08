package com.epam.hotelbooking.repository.impl;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.entity.ApartmentClass;
import com.epam.hotelbooking.repository.ApartmentRepository;
import com.epam.hotelbooking.repository.query.QueryStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@SuppressWarnings("unchecked")
public class ApartmentRepositoryImpl implements ApartmentRepository {

    private final static String CLASS_NAME = "className";
    private final static String ROOM_QUANTITY = "roomQuantity";

    @Autowired
    private SessionFactory sessionFactory;

    public List<Apartment> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(QueryStore.FIND_ALL).getResultList();
    }

    public List<Apartment> findAllFree() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(QueryStore.FIND_ALL_FREE).getResultList();
    }

    public List<Apartment> findFreeByClass(String className) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(QueryStore.FIND_FREE_BY_CLASS);
        query.setParameter(CLASS_NAME, className);
        return query.getResultList();
    }

    public List<Apartment> findFreeByRoomQuantity(int roomQuantity) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(QueryStore.FIND_FREE_BY_ROOM_QUANTITY);
        query.setParameter(ROOM_QUANTITY, roomQuantity);
        return query.getResultList();
    }

    public void save(Apartment apartment) {
        Session session = sessionFactory.getCurrentSession();
        session.save(apartment);
    }

    public Apartment findById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Apartment.class, id);
    }
}