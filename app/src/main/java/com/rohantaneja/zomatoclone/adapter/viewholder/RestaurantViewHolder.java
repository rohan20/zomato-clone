package com.rohantaneja.zomatoclone.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.rohantaneja.zomatoclone.R;
import com.rohantaneja.zomatoclone.model.pojo.RestaurantWrapper;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class RestaurantViewHolder extends RecyclerView.ViewHolder {

    private TextView restaurantNameTextView;
    private TextView restaurantAddressTextView;
    private TextView restaurantRatingTextView;

    public RestaurantViewHolder(View itemView) {
        super(itemView);

        restaurantNameTextView = itemView.findViewById(R.id.restaurant_name_text_view);
        restaurantAddressTextView = itemView.findViewById(R.id.restaurant_address_text_view);
        restaurantRatingTextView = itemView.findViewById(R.id.restaurant_rating_text_view);
    }

    public void bindData(RestaurantWrapper restaurant) {
        restaurantNameTextView.setText(restaurant.getRestaurant().getName());
        restaurantAddressTextView.setText(restaurant.getRestaurant().getName());
        restaurantRatingTextView.setText(restaurant.getRestaurant().getUserRating().getAggregateRating());
    }
}
