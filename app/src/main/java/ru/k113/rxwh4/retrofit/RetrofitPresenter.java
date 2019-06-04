package ru.k113.rxwh4.retrofit;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {

    private static final String TAG = "RetrofitDifPresenter";

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<String> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(str -> {
            Log.d(TAG, "onNext: " + str);
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }


}
