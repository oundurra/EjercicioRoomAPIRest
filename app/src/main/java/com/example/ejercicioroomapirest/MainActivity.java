package com.example.ejercicioroomapirest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import org.jetbrains.anko.*;
import org.jetbrains.anko.uiThread;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        new LoadUniversities();
    }

    private class LoadUniversities extends Thread


            (Context context) {
        doAsync {
            try {
                Response universidadResponse = getRetrofit().create(APIUniversidad.class).getUniversidadesByCountry("country=Chile").execute();
            } catch(Exception e) {
                e.printStackTrace();
            }

        }
    }

    private Retrofit getRetrofit() {
        return new Retrofit.Builder().baseUrl("http://universities.hipolabs.com/search?").addConverterFactory(GsonConverterFactory.create()).build();
    }
}