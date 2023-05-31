package com.colab;

public class Sandwich {
    private String sandwichSize;
    private String regularToppings;
    private String sauces;
    private String sides;

    public Sandwich(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }
    public void checkout(){
//        bread.getPrice + meat.getPrice + cheese.getPrice
    }

//    public Sandwich() {
//    }

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
