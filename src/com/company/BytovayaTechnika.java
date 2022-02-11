package com.company;

public class BytovayaTechnika extends Technika {
    public BytovayaTechnika() {
    }

    public BytovayaTechnika(String name, String model, int year, int price) {
        super(name, model, year, price);
    }

    @Override
    public String toString() {
        return "Бытовая техника:\n" + super.toString();
    }
}
