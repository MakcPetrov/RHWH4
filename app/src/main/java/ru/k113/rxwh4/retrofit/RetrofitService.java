package ru.k113.rxwh4.retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;
import ru.k113.rxwh4.R;

public interface RetrofitService {
    String s ="/users/MakcPetrov";
	@GET(s)
    Observable<String> getUser();
}
