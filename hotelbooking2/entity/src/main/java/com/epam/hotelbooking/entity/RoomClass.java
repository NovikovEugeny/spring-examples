package com.epam.hotelbooking.entity;

import java.io.Serializable;
import java.util.Set;

public class RoomClass implements Serializable {

    private static final long serialVersionUID = 5188951036374731519L;

    private String className;
    private int roomQuantity;
    private double cost;

    private Set<Room> rooms;

    public RoomClass() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "RoomClass{" +
                "className='" + className + '\'' +
                ", roomQuantity=" + roomQuantity +
                ", cost=" + cost +
                '}';
    }
}