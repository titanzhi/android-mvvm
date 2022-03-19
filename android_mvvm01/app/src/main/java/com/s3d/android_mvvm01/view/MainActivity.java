package com.s3d.android_mvvm01.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.s3d.android_mvvm01.R;
import com.s3d.android_mvvm01.model.DataItem;
import com.s3d.android_mvvm01.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewmodel = new ViewModelProvider(this).get(MainViewModel.class);

        observeViewModel();
    }

    private void observeViewModel() {
        viewmodel.getItemLD().observe(this, new Observer<List<DataItem>>() {
            @Override
            public void onChanged(List<DataItem> dataItems) {
                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.ic_ok);

                TextView textView = findViewById(R.id.textView);
                textView.setText("收到 " + dataItems.size()+" 个项目");
                textView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void clickPic(View view) {
        viewmodel.getItems();
    }
}