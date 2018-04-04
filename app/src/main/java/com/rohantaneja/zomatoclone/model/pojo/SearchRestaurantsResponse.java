package com.rohantaneja.zomatoclone.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class SearchRestaurantsResponse {

    @SerializedName("results_found")
    private Long resultsFound;
    @SerializedName("results_start")
    private Long resultsStart;
    @SerializedName("results_shown")
    private Long resultsShown;
    @SerializedName("restaurants")
    private List<RestaurantWrapper> restaurants = null;

    public Long getResultsFound() {
        return resultsFound;
    }

    public void setResultsFound(Long resultsFound) {
        this.resultsFound = resultsFound;
    }

    public Long getResultsStart() {
        return resultsStart;
    }

    public void setResultsStart(Long resultsStart) {
        this.resultsStart = resultsStart;
    }

    public Long getResultsShown() {
        return resultsShown;
    }

    public void setResultsShown(Long resultsShown) {
        this.resultsShown = resultsShown;
    }

    public List<RestaurantWrapper> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantWrapper> restaurants) {
        this.restaurants = restaurants;
    }

}
