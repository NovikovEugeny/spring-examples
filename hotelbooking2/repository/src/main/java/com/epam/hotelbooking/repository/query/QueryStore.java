package com.epam.hotelbooking.repository.query;

public final class QueryStore {

    private QueryStore() {
    }

    public final static String FIND_ALL = "FROM Apartment";
    public final static String FIND_ALL_FREE = "FROM Apartment WHERE status = 'free'";
    public final static String FIND_FREE_BY_CLASS = "FROM Apartment WHERE apartmentClass.className = :className";
    public final static String FIND_FREE_BY_ROOM_QUANTITY = "FROM Apartment WHERE apartmentClass.roomQuantity = :roomQuantity";
}