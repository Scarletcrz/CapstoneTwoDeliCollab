package com.colab;

public class Chip {
    private String type;
    private float chipPrice;

    public Chip( String type, int chipPrice) {
        this.type = type;
        this.chipPrice = Chip.this.chipPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return chipPrice;
    }

    public void setPrice(int chipPrice) {
        this.chipPrice = Chip.this.chipPrice;
    }

    @Override
    public String toString() {
        return "Chip - " +
                ", type: '" + type + '\'' +
                ", price: " + chipPrice;
    }
}
