package com.s3d.android_mvvm01.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.s3d.android_mvvm01.model.DataItem;
import com.s3d.android_mvvm01.model.DataItemProvider;

import java.util.List;
import java.util.Random;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<DataItem>> itemLD = new MutableLiveData<List<DataItem>>();

    public MutableLiveData<List<DataItem>> getItemLD() {
        return itemLD;
    }

    public void getItems () {
        List<DataItem> items = DataItemProvider.getInstance().getDataItems((new Random()).nextInt(100));
        itemLD.setValue(items);
    }
}
