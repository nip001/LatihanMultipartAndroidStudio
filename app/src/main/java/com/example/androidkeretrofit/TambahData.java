package com.example.androidkeretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class TambahData extends AppCompatActivity {

    EditText editNama,editUmur;
    Button btnFoto,btnSubmit;
    ImageView imageGambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);
        editNama= findViewById(R.id.editNama);
        editUmur= findViewById(R.id.editUmur);
        btnFoto= findViewById(R.id.btnFoto);
        btnSubmit= findViewById(R.id.btnSubmit);
        imageGambar= findViewById(R.id.imageGambar);


    }
}