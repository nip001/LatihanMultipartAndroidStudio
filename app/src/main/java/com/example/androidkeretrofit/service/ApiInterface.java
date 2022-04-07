package com.example.androidkeretrofit.service;

import com.example.androidkeretrofit.model.Peserta;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @GET("/")
    Call<List<Peserta>> getAllPeserta();

    @Multipart
    @POST("/")
    Call<String> savePeserta(@Part("file") MultipartBody.Part file,
                             @Part("data") RequestBody data);
}
