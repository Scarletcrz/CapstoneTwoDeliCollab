package com.colab;

public class Chip {
    private String type;
    private float price;

    public Chip( String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chip - " +
                ", type: '" + type + '\'' +
                ", price: " + price;
    }
}
