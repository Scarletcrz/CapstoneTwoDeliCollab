package com.colab;

public class Sandwich {
    private String sandwichSize;
    private double sandwichPrice;
    private String meatSize;
    private double extraMeat;
    private String cheeseSize;
    private double extraCheesePrice;
    private String regularToppings;
    private String sauce;
    private String side;

    public void checkout(){
//        bread.getPrice + meat.getPrice + cheese.getPrice
    }

//    public Sandwich() {
//    }


    public Sandwich(String sandwichSize, String meatSize, double extraMeat, String cheeseSize, double extraCheesePrice,
                    String regularToppings, String sauces, String sides) {
        this.sandwichSize = sandwichSize;
        this.meatSize = meatSize;
        this.extraMeat = extraMeat;
        this.cheeseSize = cheeseSize;
        this.extraCheesePrice = extraCheesePrice;
        this.regularToppings = regularToppings;
        this.sauce = sauces;
        this.side = sides;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getMeatSize() {
        return meatSize;
    }

    public void setMeatSize(String meatSize) {
        this.meatSize = meatSize;
    }

    public double getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(double extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheeseSize() {
        return cheeseSize;
    }

    public void setCheeseSize(String cheeseSize) {
        this.cheeseSize = cheeseSize;
    }


    public double getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public void setExtraCheesePrice(double extraCheesePrice) {
        this.extraCheesePrice = extraCheesePrice;
    }

    public String getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(String regularToppings) {
        this.regularToppings = regularToppings;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichSize='" + sandwichSize + '\'' +
                ", sandwichPrice=" + sandwichPrice +
                ", meatSize='" + meatSize + '\'' +
                ", extraMeat=" + extraMeat +
                ", cheeseSize='" + cheeseSize + '\'' +
                ", extraCheesePrice=" + extraCheesePrice +
                ", regularToppings='" + regularToppings + '\'' +
                ", sauce='" + sauce + '\'' +
                ", side='" + side + '\'' +
                '}';
    }
}
