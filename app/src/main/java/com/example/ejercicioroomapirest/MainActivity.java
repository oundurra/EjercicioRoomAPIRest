package com.example.ejercicioroomapirest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

import java.io.IOException;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView rvUniversidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        new LoadUniversities().execute();
    }

    private class LoadUniversities extends AsyncTask<String, Void, String> {
        List<Universidad> listUniversidad;
        @Override
        protected String doInBackground(String... strings) {
            try{
                listUniversidad = getRetrofit().create(APIUniversidad.class).getUniversidadesByCountry("search?country=chile").execute().body();
            } catch(IOException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            rvUniversidad = (RecyclerView) findViewById(R.id.rvUniversidad);
            rvUniversidad.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            rvUniversidad.setAdapter(new UniversidadAdapter(listUniversidad, getApplicationContext()));
        }


        private Retrofit getRetrofit() {
            return new Retrofit.Builder().baseUrl("http://universities.hipolabs.com/").addConverterFactory(GsonConverterFactory.create()).build();
        }
    }


}