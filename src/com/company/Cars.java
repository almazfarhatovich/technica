package com.company;

public class Cars extends Technika{
    public Cars() {
    }

    public Cars(String name, String model, int year, int price) {
        super(name, model, year, price);
    }

    @Override
    public String toString() {
        return "Машины:\n" + super.toString();
    }
}
