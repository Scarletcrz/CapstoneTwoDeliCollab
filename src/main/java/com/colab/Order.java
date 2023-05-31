package com.colab;
import java.util.ArrayList;
public class Order {

    private ArrayList<Product> beverage;
        public Order(){
            this.beverage = new ArrayList<>();
        }
        public void addProduct(Product product){
            beverage.add(product);
            beverage.add(Water);
        }



}
