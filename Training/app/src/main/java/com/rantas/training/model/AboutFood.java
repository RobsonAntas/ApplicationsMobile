package com.rantas.training.model;

import android.util.Log;

import java.io.Serializable;

public class AboutFood implements Serializable {
    public static final String LOG_MODEL = AboutFood.class.getSimpleName();
    private String food;
    private String description;

    public AboutFood(String food, String description) {
        Log.i(LOG_MODEL, "creating AboutFood");
        this.food =food;
        this.description =description;
    }

    public String getFood() {
        Log.i(LOG_MODEL,"getting food name");
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDescription() {
        Log.i(LOG_MODEL,"getting description");
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
