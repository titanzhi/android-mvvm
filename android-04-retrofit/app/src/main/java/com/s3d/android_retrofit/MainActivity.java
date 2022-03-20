package com.s3d.android_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.s3d.android_retrofit.model.CountriesService;
import com.s3d.android_retrofit.model.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.result);

        CountriesService.getInstance().getCoutries().enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                result.setText("收到 " + response.body().size()+" 个项目");
                result.setVisibility(View.GONE);
                displayCountries(response.body());
            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                result.setText("onFailure");
            }
        });
    }

    private void displayCountries(List<Country> results) {
        if(results != null) {
            List<Country> subList = results.subList(0, 20);
            for (Country country: subList) {
                ImageView view = new ImageView(this);

                Glide.with(this).load(country.getFlag()).into(view);

                ViewGroup listLayout = findViewById(R.id.listLayout);

                listLayout.addView(view);
            }
        }

    }
}