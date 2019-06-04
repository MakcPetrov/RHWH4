package ru.k113.rxwh4.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import ru.k113.rxwh4.R;

public class RetrofitActivity extends AppCompatActivity {

    private static final String TAG = "mRetrofitActivity";

    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        retrofitPresenter = new RetrofitPresenter();
    }

    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
        retrofitPresenter.getString();
    }//onClickButton

}
