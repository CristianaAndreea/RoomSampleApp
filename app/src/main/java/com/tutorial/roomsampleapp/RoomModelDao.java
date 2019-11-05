package com.tutorial.roomsampleapp;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RoomModelDao {

    @Query("SELECT * FROM roomModels")
    List<RoomModel> getAll();
}
