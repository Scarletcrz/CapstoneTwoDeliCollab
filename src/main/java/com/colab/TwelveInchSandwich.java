package com.colab;

public class TwelveInchSandwich extends Sandwich {
    private String breadType;
    private double breadPrice;
    private String meatType;
    private double meatPrice;
    private String cheeseType;
    private double cheesePrice;
    public TwelveInchSandwich(String sandwichSize){super(sandwichSize);}

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getBreadPrice() {
        return breadPrice;
    }

    public void setBreadPrice(double breadPrice) {
        this.breadPrice = breadPrice;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    @Override
    public String toString() {
        return "TwelveInchSandwich{" +
                "breadType='" + breadType + '\'' +
                ", breadPrice=" + breadPrice +
                ", meatType='" + meatType + '\'' +
                ", meatPrice=" + meatPrice +
                ", cheeseType='" + cheeseType + '\'' +
                ", cheesePrice=" + cheesePrice +
                '}';
    }
}
