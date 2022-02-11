package com.company;

public class Technika {
 private String name;
 private String model;
 private int year;
 private int price;

    public Technika() {
    }

    public Technika(String name, String model, int year, int price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name:" + getName() + "\n" +
                "model:" + getModel() + "\n" +
                "year:" + getYear() + "\n" +
                "price:" + getPrice() + "\n";
    }
}
