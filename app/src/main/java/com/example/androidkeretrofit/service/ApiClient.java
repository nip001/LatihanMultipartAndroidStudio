package com.example.androidkeretrofit.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit retrofit;
    public static final String URL = "https://e1be-139-192-158-19.ngrok.io";

    public static Retrofit getRetrofit(){
        if(retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}