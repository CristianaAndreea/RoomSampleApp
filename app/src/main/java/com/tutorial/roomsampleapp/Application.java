package com.tutorial.roomsampleapp;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppDatabase roomInstance = AppDatabase.getInstance(this);
    }
}
