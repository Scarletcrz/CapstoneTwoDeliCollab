package com.colab;

import java.util.ArrayList;

public class Sandwich {
    private String sandwichSize;
    private ArrayList<String> breadTopping = new ArrayList<>();
//    public String breadType;
    private ArrayList<String> meatTopping = new ArrayList<>();
    private ArrayList<String> cheeseTopping = new ArrayList<>();

    private ArrayList<String> sauce = new ArrayList<>();
    private ArrayList<String> side = new ArrayList<>(); // made all of these arraylists, gotta fix all the gets sets and cons
    private String extraMeat;
    private String extraCheese;


    public Sandwich(String sandwichSize, ArrayList<String> breadTopping, ArrayList<String> meatTopping,ArrayList<String> cheeseTopping,ArrayList<String> sauce, ArrayList<String> side, String extraMeat, String extraCheese) {
        this.sandwichSize = sandwichSize;
        this.breadTopping = breadTopping;
        this.meatTopping = meatTopping;
        this.cheeseTopping = cheeseTopping;
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

    public String getBreadTopping(String breadTopping){
        return breadTopping;
    }
    public void addBreadTopping(String breadTopping){
        this.breadTopping.add(breadTopping);
    }
    public ArrayList<String> getmeatTopping(String meat){
        return meatTopping;
    }
    public void addMeatTopping(String meatTopping){
        this.meatTopping.add(meatTopping);
    }
    public ArrayList<String> getCheeseTopping (String cheese){
        return cheeseTopping;
    }
    public void addCheeseTopping(String cheeseTopping){
        this.cheeseTopping.add(cheeseTopping);
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
        if (meatTopping.equals("small")) {
            return 1.00;
        } else if (meatTopping.equals("medium")) {
            return 2.00;
        } else if (meatTopping.equals("large")) {
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
    public double getCostExtraCheese() {
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
                ", breadToppings=" + breadTopping +
                ", meatToppings=" + meatTopping +
                ", cheeseToppings=" + cheeseTopping +
                ", sauce=" + sauce +
                ", side=" + side +
                '}';
    }
}
