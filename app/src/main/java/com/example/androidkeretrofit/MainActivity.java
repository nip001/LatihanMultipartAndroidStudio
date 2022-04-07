package com.example.androidkeretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidkeretrofit.adapter.PesertaAdapter;
import com.example.androidkeretrofit.model.Peserta;
import com.example.androidkeretrofit.service.ApiClient;
import com.example.androidkeretrofit.service.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btnTambah;
    RecyclerView rvPeserta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeserta=findViewById(R.id.rvPeserta);
        btnTambah=findViewById(R.id.btnTambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


        ApiInterface apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<List<Peserta>> apiCall= apiInterface.getAllPeserta();

        apiCall.enqueue(new Callback<List<Peserta>>() {
            @Override
            public void onResponse(Call<List<Peserta>> call, Response<List<Peserta>> response) {
                PesertaAdapter adapter = new PesertaAdapter(MainActivity.this
                        ,response.body());
                RecyclerView.LayoutManager layoutManager = new
                        LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.HORIZONTAL,false);
                rvPeserta.setLayoutManager(layoutManager);
                rvPeserta.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Peserta>> call, Throwable t) {

            }
        });


    }
}