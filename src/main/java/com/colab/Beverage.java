package com.colab;

public class Beverage {
    private String size;
    private String drinkType;
    private float price;

    public Beverage(String size, String drinkType, Float price) {
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

    public String getType() {
        return drinkType;
    }

    public void setType(String drinkType) {
        this.drinkType = drinkType;
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
