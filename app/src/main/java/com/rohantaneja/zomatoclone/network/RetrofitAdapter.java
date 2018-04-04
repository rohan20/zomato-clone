package com.rohantaneja.zomatoclone.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class RetrofitAdapter {
    private ZomatoAPI zomatoAPI;

    public RetrofitAdapter(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        zomatoAPI = retrofit.create(ZomatoAPI.class);
    }

    public ZomatoAPI getZomatoAPI() {
        return zomatoAPI;
    }
}
