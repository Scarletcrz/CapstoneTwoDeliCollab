package com.colab;

import java.util.ArrayList;

public class Sandwich {
    private String sandwichSize;
    private ArrayList<String> regularToppings;
    private ArrayList<String> sauces;
    private ArrayList<String> sides; // made all of these arraylists, gotta fix all the gets sets and cons

    public Sandwich(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public Sandwich() {

    }

    public void checkout(){
//        bread.getPrice + meat.getPrice + cheese.getPrice
    }

    public Sandwich(String regularToppings, String sauces, String sides) {
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.sides = sides;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(String regularToppings) {
        this.regularToppings = regularToppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public void

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichSize='" + sandwichSize + '\'' +
                ", regularToppings='" + regularToppings + '\'' +
                ", sauces='" + sauces + '\'' +
                ", sides='" + sides + '\'' +
                '}';
    }
}
