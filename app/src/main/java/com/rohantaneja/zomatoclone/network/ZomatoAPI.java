package com.rohantaneja.zomatoclone.network;

import com.rohantaneja.zomatoclone.model.pojo.SearchRestaurantsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rohantaneja on 04/04/18.
 */

public interface ZomatoAPI {

    @GET("search")
    Call<SearchRestaurantsResponse> getRestaurantsResponse(
            @Query("q") String query,
            @Query("start") int start,
            @Query("count") int count
    );

}
