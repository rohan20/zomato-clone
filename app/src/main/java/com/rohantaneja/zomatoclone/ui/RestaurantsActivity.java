package com.rohantaneja.zomatoclone.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import com.rohantaneja.zomatoclone.R;
import com.rohantaneja.zomatoclone.model.pojo.RestaurantWrapper;
import com.rohantaneja.zomatoclone.model.pojo.SearchRestaurantsResponse;
import com.rohantaneja.zomatoclone.network.RetrofitAdapter;
import com.rohantaneja.zomatoclone.util.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantsActivity extends AppCompatActivity {

    private static final String TAG = "RestaurantsActivity";

    private EditText searchRestaurantEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_filer:
                filterRestaurantResults();
                break;

            case R.id.action_search:
                searchRestaurants();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void filterRestaurantResults() {
    }

    private void searchRestaurants() {

        Log.d(TAG, "Searching...");

        RetrofitAdapter retrofitAdapter = new RetrofitAdapter(Constants.RESTAURANTS_BASE_URL);
        Call<SearchRestaurantsResponse> restaurantsResponse = retrofitAdapter.getZomatoAPI().getRestaurantsResponse("saket", 1, 20);

        restaurantsResponse.enqueue(new Callback<SearchRestaurantsResponse>() {
            @Override
            public void onResponse(Call<SearchRestaurantsResponse> call, Response<SearchRestaurantsResponse> response) {
                if (response.isSuccessful()) {
                    populateRestaurantsList(response.body().getRestaurants());
                } else {
                    Log.d(TAG, "Response Unsuccessful");
                }
            }

            @Override
            public void onFailure(Call<SearchRestaurantsResponse> call, Throwable t) {
                Log.d(TAG, "onFail: " + t.getLocalizedMessage());
            }
        });
    }

    private void populateRestaurantsList(List<RestaurantWrapper> restaurants) {
        Log.d(TAG, restaurants.get(0).getRestaurant().getName());
        Log.d(TAG, restaurants.get(1).getRestaurant().getName());
        Log.d(TAG, restaurants.get(2).getRestaurant().getName());
    }
}
