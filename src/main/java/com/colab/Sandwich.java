package com.colab;

import java.util.ArrayList;

public class Sandwich {
    private String sandwichSize;
    private ArrayList<String> regularToppings = new ArrayList<>();
    private ArrayList<String> sauce = new ArrayList<>();
    private ArrayList<String> side = new ArrayList<>(); // made all of these arraylists, gotta fix all the gets sets and cons
    private String extraMeat;
    private String extraCheese;


    public Sandwich(String sandwichSize, ArrayList<String> regularToppings, ArrayList<String> sauce, ArrayList<String> side, String extraMeat, String extraCheese) {
        this.sandwichSize = sandwichSize;
        this.regularToppings = regularToppings;
        this.sauce = sauce;
        this.side = side;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }
    public Sandwich(){}


    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(String extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(String extraCheese) {
        this.extraCheese = extraCheese;
    }

    public ArrayList<String> getRegularToppings (){
        return regularToppings;
    }
    public void addRegularToppings(String regularTopping){
        this.regularToppings.add(regularTopping);
    }

    public ArrayList<String> getSauce() {
        return sauce;
    }
    public void addSauce(String sauce){
        this.sauce.add(sauce);
    }
    public ArrayList<String> getSide() {
        return side;
    }
    public void addSide(String side) {
        this.side.add(side);
    }

    public double getCostSandwich() {
        if (sandwichSize.equals("small")) {
            return 5.50;
        } else if (sandwichSize.equals("medium")) {
            return 7.00;
        } else if (sandwichSize.equals("large")) {
            return 8.50;
        } else {
            return 0.00; // Default cost if size is unknown
        }
    }

    public double getCostMeatToppings() {
        if (regularToppings.equals("small")) {
            return 1.00;
        } else if (regularToppings.equals("medium")) {
            return 2.00;
        } else if (regularToppings.equals("large")) {
            return 3.00;
        } else {
            return 0.00; // Default cost if size is unknown
        }
    }
    public double getCostExtraMeat() {
        if (extraMeat.equals("small")) {
            return .50;
        } else if (extraMeat.equals("medium")) {
            return 1.00;
        } else if (extraMeat.equals("large")) {
            return 1.50;
        } else {
            return 0.00; // Default cost if size is unknown
        }
    }
    public double getCost() {
        if (extraCheese.equals("small")) {
            return 0.30;
        } else if (extraCheese.equals("medium")) {
            return 0.60;
        } else if (extraCheese.equals("large")) {
            return 0.90;
        } else {
            return 0.00; // Default cost if size is unknown
        }
    }



    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichSize='" + sandwichSize + '\'' +
                ", regularToppings=" + regularToppings +
                ", sauce=" + sauce +
                ", side=" + side +
                '}';
    }
}
