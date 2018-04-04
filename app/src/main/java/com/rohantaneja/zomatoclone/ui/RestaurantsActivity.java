package com.rohantaneja.zomatoclone.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.rohantaneja.zomatoclone.R;

public class RestaurantsActivity extends AppCompatActivity {

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
        switch (item.getItemId()){
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
    }
}
