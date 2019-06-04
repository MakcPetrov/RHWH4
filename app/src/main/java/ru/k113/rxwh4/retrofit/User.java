package ru.k113.rxwh4.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


class User {

    @Expose
    @SerializedName("name")
    String name;

    @Expose
    @SerializedName("avatar_url")
    String avatar_url;
}
