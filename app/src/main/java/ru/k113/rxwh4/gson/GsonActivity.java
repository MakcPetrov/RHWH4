package ru.k113.rxwh4.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.k113.rxwh4.R;

public class GsonActivity extends AppCompatActivity {

    private static final String TAG = "mGsonActivity";

    String json = "{\"time_of_year\": \"summer\", \"year\": 2019"+"}";

    Gson gson = new GsonBuilder().create();

    Season mSeason = gson.fromJson(json,Season.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        Log.d(TAG,json);
        Log.d(TAG, "onCreate: " + mSeason.time_of_year);
        Log.d(TAG, "onCreate: " + mSeason.year);
    }
}
