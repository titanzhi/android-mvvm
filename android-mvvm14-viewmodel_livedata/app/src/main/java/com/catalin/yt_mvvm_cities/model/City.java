package com.catalin.yt_mvvm_cities.model;

public class City {

    private String name;
    private int img;
    private int population;

    public City(String name, int img, int population) {
        this.name = name;
        this.img = img;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
