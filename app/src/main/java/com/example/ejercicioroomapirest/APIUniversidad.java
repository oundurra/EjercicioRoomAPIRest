package com.example.ejercicioroomapirest;

import java.lang.annotation.Target;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface APIUniversidad {
    @GET
    public Call<Universidad> getUniversidadesByCountry(@Url String url);
}
