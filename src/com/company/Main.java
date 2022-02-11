package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Blender blender = new Blender("Блендер","Vitamix",2022,5000);
        Microvolnovka micro = new Microvolnovka("Микроволновка","SAMSUNG",2018,6000);
        Technika[] technikas = {blender,micro};
        for (Technika t:technikas) {
            System.out.println(t);
        }
        Toyota toyota = new Toyota("Toyota","Land Cruser 300",2021,11800);
        Bmw bmw = new Bmw("BMW","M5 CS",2022,150000);
        Cars[] cars = {toyota,bmw};
        for (Cars c:cars) {
            System.out.println(c);
        }
        Phone phone = new Phone("Iphone","13 pro max",2021,1100);
        Tv tv = new Tv("TV","YASIN",2020,30000);
        Electronika[] electronikas = {phone,tv};
        for (Electronika e:electronikas) {
            System.out.println(e);
        }
    }
}
