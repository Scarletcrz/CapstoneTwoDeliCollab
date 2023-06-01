package com.colab;
import java.io.FileWriter;
import java.io.IOException;

public class CheckOut {

//    public class OrderSystem {
        private String orderDetails;
        private double price;

    public CheckOut(String orderDetails, double price) {
        this.orderDetails = orderDetails;
        this.price = price;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayOrderDetails() {
            System.out.println("Order Details:");
            System.out.println(orderDetails);
            System.out.println("Price: $" + price);
        }

        public void createReceipt() {
            try {
                FileWriter receiptFile = new FileWriter("receipt.txt");
                receiptFile.write("Order Details:\n");
                receiptFile.write(orderDetails + "\n");
                receiptFile.write("Price: $" + price + "\n");
                receiptFile.close();
                System.out.println("Receipt created successfully.");
            } catch (IOException e) {
                System.out.println("Error creating receipt file.");
            }
        }

        public void homeScreen() {
            System.out.println("\nHome Screen");
            System.out.println("1. Checkout");
            System.out.println("2. Confirm");
            System.out.println("3. Cancel");

            int choice = Integer.parseInt(System.console().readLine("Enter your choice (1-3): "));

            switch (choice) {
                case 1:
                    displayOrderDetails();
                    break;
                case 2:
                    createReceipt();
                    break;
                case 3:
                    System.out.println("Order cancelled.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    @Override
    public String toString() {
        return "CheckOut{" +
                "orderDetails='" + orderDetails + '\'' +
                ", price=" + price +
                '}';
    }
}

//}
