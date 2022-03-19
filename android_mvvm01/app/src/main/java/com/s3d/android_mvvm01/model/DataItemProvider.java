package com.s3d.android_mvvm01.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataItemProvider {

    private static DataItemProvider instance;
    static {
        instance = new DataItemProvider();
    }
    public static DataItemProvider getInstance() {
        return instance;
    }

    public List<DataItem> getDataItems (int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list.stream().map(DataItem::new).collect(Collectors.toList());
    }
}
