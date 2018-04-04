package com.rohantaneja.zomatoclone.network;

import com.rohantaneja.zomatoclone.model.pojo.SearchRestaurantsResponse;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by rohantaneja on 04/04/18.
 */

public interface ZomatoAPI {

    @GET("search")
    SearchRestaurantsResponse getRestaurantsResponse(
            @Query("q") String query,
            @Query("start") int start,
            @Query("count") int count
    );

}
