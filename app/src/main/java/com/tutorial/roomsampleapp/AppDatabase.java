package com.tutorial.roomsampleapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {RoomModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase instance;

    public abstract RoomModelDao roomModelDao();

    public static AppDatabase getInstance(Context context) {
        if(instance == null){
            synchronized (AppDatabase.class){
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        AppDatabase.class,
                        "my_database")
                        .build();

            }
        }
        return instance;
    }

}
