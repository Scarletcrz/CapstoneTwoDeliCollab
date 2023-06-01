package com.colab;

import java.util.ArrayList;

public class Beverage {
    private String size;
    private ArrayList<String> drinkType = new ArrayList<>();
    private float price;

    public Beverage(String size, ArrayList<String> drinkType, float price) {
        this.size = size;
        this.drinkType = drinkType;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getDrinkType() {
        return drinkType;
    }

    public void addDrinkType(String drinkType) {
        this.drinkType.add(drinkType);
    }
    public float getPrice(){
        return price;
    }
    public float setPrice(float price){
        return this.price = price;
    }

    @Override
    public String toString() {
        return "Beverage - " +
                "size: '" + size + '\'' +
                ", typ: '" + drinkType + '\'' +
                ", price: " + price;
    }
}
