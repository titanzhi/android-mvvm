package com.catalin.yt_mvvm_cities.viewmodel;


import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.catalin.yt_mvvm_cities.model.City;
import com.catalin.yt_mvvm_cities.model.CityDataProvider;

import java.util.List;

public class CityViewModel extends ViewModel {

    private MutableLiveData<City> cityData = new MutableLiveData<>();
    private final List<City> cities = (new CityDataProvider()).getCities();
    private int currentIndex = 0;
    private final long delay = 2000L;

    public CityViewModel() {
        loop();
    }

    public LiveData<City> getCityData() {
        return cityData;
    }

    private void updateCity () {
        currentIndex++;
        currentIndex %= cities.size();

        cityData.setValue(cities.get(currentIndex));

        loop();
    }

    private void loop() {
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
            @Override
            public void run() {
                updateCity();
            }
        } , delay);
    }

}
