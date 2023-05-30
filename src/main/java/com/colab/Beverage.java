package com.colab;

public class Beverage {
    private String size;
    private String type;
    private float price;

    public Beverage(String size, String type, Float price) {
        this.size = size;
        this.type = type;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", typ: '" + type + '\'' +
                ", price: " + price;
    }
}
