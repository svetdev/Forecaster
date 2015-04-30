package com.svetliy.forecaster;
//change git config user email for this app
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ForecasterActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecaster);

        String apiKey = "187ace138d2a8aa7c996cfe74c5c2eb1";
        double latitude = 37.8267;
        double longitude = -122.423;
        String forecastUrl = "https://api.forecast.io/forecast/" + apiKey +
                "/" + latitude + "," + -longitude;
       
    }


}
