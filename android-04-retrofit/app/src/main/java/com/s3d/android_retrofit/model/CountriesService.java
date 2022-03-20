package com.s3d.android_retrofit.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountriesService {

    private static final String BASE_URL  = "https://raw.githubusercontent.com";

    private static CountriesService instance;

    public static CountriesService getInstance() {
        if(instance == null)
            instance = new CountriesService();

        return instance;
    }

    private final CountriesApi api;
    private CountriesService () {
        api = (new Retrofit.Builder())
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CountriesApi.class);
    }

    public Call<List<Country>> getCoutries () {
        return api.getCoutries();
    }
}
