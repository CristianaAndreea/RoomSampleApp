package com.tutorial.roomsampleapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "roomModels")
public class RoomModel {

    @PrimaryKey
    public int id;
}
