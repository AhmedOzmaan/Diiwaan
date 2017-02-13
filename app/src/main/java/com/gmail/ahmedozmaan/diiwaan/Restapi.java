package com.gmail.ahmedozmaan.diiwaan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Aditya on 09-May-16.
 */
public interface Restapi {

    @GET("/users")
    Call<List<Users>> getPosts();
}
