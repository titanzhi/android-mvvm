package com.s3d.android_retrofit.model;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("name")
    private String countryName;

    @SerializedName("flagPNG")
    private String flag;

    public Country(String countryName, String flag) {
        this.countryName = countryName;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
