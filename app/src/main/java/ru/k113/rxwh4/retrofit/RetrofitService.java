package ru.k113.rxwh4.retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitService {
	@GET("/users/JakeWharton")
    Observable<String> getUser();
}
