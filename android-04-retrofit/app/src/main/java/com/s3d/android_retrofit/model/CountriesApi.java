package com.s3d.android_retrofit.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
    public Call<List<Country>> getCoutries();


}
