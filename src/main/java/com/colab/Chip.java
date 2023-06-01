package com.colab;

import java.util.ArrayList;

public class Chip {
    private ArrayList<String> chipType = new ArrayList<>();
    private float chipPrice;

    public Chip(ArrayList<String> chipType, float chipPrice) {
        this.chipType = chipType;
        this.chipPrice = chipPrice;
    }

    public ArrayList<String> getChipType(){
        return chipType;
    }

    public void addChipType(String chipType){
        this.chipType.add(chipType);
    }

    public float getPrice() {
        return chipPrice;
    }


    public void setPrice(int chipPrice) {
        this.chipPrice = Chip.this.chipPrice;
    }
    public double getCost() {
        if (chipType.equals("yes")) {
            return 1.50;
        } else {
            return 0.00; // Default cost if size is unknown
        }
    }

    @Override
    public String toString() {
        return "Chip - " +
                ", type: '" + chipType + '\'' +
                ", price: " + chipPrice;
    }
}
