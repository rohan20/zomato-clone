package com.rohantaneja.zomatoclone.model.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class RestaurantWrapper {

    @SerializedName("restaurant")
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
