package com.colab;

import java.util.ArrayList;

public abstract class Product {
    ArrayList<String> product = new ArrayList<String>();



    // sandwiches, chips, drinks

    //    private double price;
    private String name;

    public Product(ArrayList<String> product, String name) {
        this.product = product;
        this.name = name;
    }

    public Product() {

    }


    public ArrayList<String> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<String> product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}