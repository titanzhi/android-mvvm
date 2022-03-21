package com.catalin.yt_mvvm_cities.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.catalin.yt_mvvm_cities.R;
import com.catalin.yt_mvvm_cities.databinding.ActivityMainBinding;
import com.catalin.yt_mvvm_cities.model.City;
import com.catalin.yt_mvvm_cities.viewmodel.CityViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CityViewModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        model = new ViewModelProvider(this).get(CityViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();

        model.getCityData().observe(this, new Observer<City>() {
            @Override
            public void onChanged(City city) {
                binding.cityImage.setImageDrawable(
                        ResourcesCompat.getDrawable(getResources() ,city.getImg() , getApplicationContext().getTheme())
                );

                binding.cityNameTV.setText(city.getName());
                binding.cityPopuliationTV.setText(String.valueOf(city.getPopulation()));
            }
        });
    }
}