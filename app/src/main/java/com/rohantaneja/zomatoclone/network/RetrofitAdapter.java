package com.rohantaneja.zomatoclone.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class RetrofitAdapter {
    private ZomatoAPI zomatoAPI;

    public RetrofitAdapter(String baseUrl) {
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("user-key", "c750173e8cf7e5fdc2c331cf897ee8c3").build();
                return chain.proceed(request);
            }
        });

        OkHttpClient okHttpClient = okHttpBuilder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        zomatoAPI = retrofit.create(ZomatoAPI.class);
    }

    public ZomatoAPI getZomatoAPI() {
        return zomatoAPI;
    }
}
