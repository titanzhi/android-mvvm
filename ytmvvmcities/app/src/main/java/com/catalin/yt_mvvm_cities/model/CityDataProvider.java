package com.catalin.yt_mvvm_cities.model;

import com.catalin.yt_mvvm_cities.R;

import java.util.ArrayList;
import java.util.List;

public class CityDataProvider {

    private final List<City> cities = new ArrayList<City>();

    public CityDataProvider() {
        this.cities.add(new City("city1", R.drawable.city01, 3009987));
        this.cities.add(new City("city2", R.drawable.city02, 300993));
        this.cities.add(new City("city3", R.drawable.city03, 3009984));
        this.cities.add(new City("city4", R.drawable.city04, 2109987));
        this.cities.add(new City("city5", R.drawable.city05, 9987));
    }

    public List<City> getCities() {
        return cities;
    }
}
