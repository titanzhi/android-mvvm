package com.s3d.databinding;

public class Driver {
    private String name;
    private int image;
    private int age;

    public Driver(String name, int image, int age) {
        this.name = name;
        this.image = image;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
