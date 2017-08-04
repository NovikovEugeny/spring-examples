package com.epam.hotelbooking.entity;

import java.io.Serializable;

public class Room implements Serializable {

    private static final long serialVersionUID = -8696104173112695592L;

    private String id;
    private RoomClass roomClass;
    private String status;

    public Room() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoomClass getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(RoomClass roomClass) {
        this.roomClass = roomClass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", roomClass=" + roomClass +
                ", status='" + status + '\'' +
                '}';
    }
}