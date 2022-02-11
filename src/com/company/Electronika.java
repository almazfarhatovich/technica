package com.company;

public class Electronika extends Technika{
    public Electronika() {
    }

    public Electronika(String name, String model, int year, int price) {
        super(name, model, year, price);
    }

    @Override
    public String toString() {
        return "Электроника:\n" + super.toString();
    }
}

