package com.rohantaneja.zomatoclone.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rohantaneja.zomatoclone.R;
import com.rohantaneja.zomatoclone.adapter.RestaurantsAdapter;
import com.rohantaneja.zomatoclone.model.pojo.Restaurant;
import com.rohantaneja.zomatoclone.model.pojo.RestaurantWrapper;
import com.rohantaneja.zomatoclone.model.pojo.SearchRestaurantsResponse;
import com.rohantaneja.zomatoclone.network.RetrofitAdapter;
import com.rohantaneja.zomatoclone.util.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantsActivity extends AppCompatActivity {

    private static final String TAG = "RestaurantsActivity";
    private EditText searchRestaurantEditText;
    private List<RestaurantWrapper> restaurantList;
    private RestaurantsAdapter restaurantsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        searchRestaurantEditText = findViewById(R.id.search_edit_text);
        restaurantList = new ArrayList<>();
        setupRestaurantsRecyclerView();

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
                showSearchBar();
//                searchRestaurants();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupRestaurantsRecyclerView() {
        RecyclerView restaurantsRecyclerVie = findViewById(R.id.restaurants_recycler_view);
        restaurantsAdapter = new RestaurantsAdapter(this);
        restaurantsAdapter.updateRestaurantsList(restaurantList);
        restaurantsRecyclerVie.setAdapter(restaurantsAdapter);
    }

    private void showSearchBar() {

        searchRestaurantEditText.setVisibility(View.VISIBLE);

        searchRestaurantEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                    String searchQuery = searchRestaurantEditText.getText().toString();

                    if (!searchQuery.isEmpty())
                        searchRestaurants(searchQuery);
                    return true;
                }
                return false;
            }
        });
    }

    private void filterRestaurantResults() {
    }

    private void searchRestaurants(String searchQuery) {

        Log.d(TAG, "Searching...");

        RetrofitAdapter retrofitAdapter = new RetrofitAdapter(Constants.RESTAURANTS_BASE_URL);
        Call<SearchRestaurantsResponse> restaurantsResponse = retrofitAdapter.getZomatoAPI().getRestaurantsResponse(searchQuery, 1, 20);

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

        if (restaurants.size() == 0) {
            Toast.makeText(this, "No results found", Toast.LENGTH_SHORT).show();
            return;
        }

        Log.d(TAG, restaurants.get(0).getRestaurant().getName());
        Log.d(TAG, restaurants.get(1).getRestaurant().getName());
        Log.d(TAG, restaurants.get(2).getRestaurant().getName());

        restaurantsAdapter.updateRestaurantsList(restaurants);
    }
}
