package com.s3d.databinding;

public class Car {
    private int image;
    private String brand;
    private String model;
    private int topSpeed;

    public Car(int image, String brand, String model, int topSpeed) {
        this.image = image;
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
