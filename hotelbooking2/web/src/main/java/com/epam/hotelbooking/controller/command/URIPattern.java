package com.epam.hotelbooking.controller.command;

public final class URIPattern {

    private URIPattern() {
    }

    public final static String SHOW_APARTMENTS = "^/apartments/$";
    public final static String SHOW_FREE_APARTMENTS = "^/apartments/free/$";
    public final static String SHOW_FREE_APARTMENTS_BY_CLASS = "^/apartments/free/class/.+/$";
    public final static String SHOW_FREE_APARTMENTS_BY_ROOM_QUANTITY = "^/apartments/free/room_quantity/\\d/$";
}