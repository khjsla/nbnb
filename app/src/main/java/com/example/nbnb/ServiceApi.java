package com.example.nbnb;

import  com.example.nbnb.JoinData;
import com.example.nbnb.JoinResponse;
import com.example.nbnb.LoginData;
import com.example.nbnb.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("/user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);
}
