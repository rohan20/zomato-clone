package com.rohantaneja.zomatoclone.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rohantaneja.zomatoclone.R;
import com.rohantaneja.zomatoclone.adapter.viewholder.RestaurantViewHolder;
import com.rohantaneja.zomatoclone.model.pojo.Restaurant;

import java.util.List;

/**
 * Created by rohantaneja on 04/04/18.
 */
public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantViewHolder> {

    private final Context context;
    private List<Restaurant> restaurantList;

    public RestaurantsAdapter(List<Restaurant> restaurantList, Context context) {
        this.restaurantList = restaurantList;
        this.context = context;
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_restaurant, parent, false);
        return new RestaurantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant item = restaurantList.get(position);
        //TODO Fill in your logic for binding the view.
    }

    @Override
    public int getItemCount() {
        if (restaurantList == null) {
            return 0;
        }

        return restaurantList.size();
    }
}