package com.colab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int optionInput;

        do {
            System.out.println("Here are your options: \n" +
                    "\t1 - Place a New Order\n" +
                    "\t2 - Exit\n" +
                    "Enter which one you would like: \n"
            );
            optionInput = scanner.nextInt();

            switch (optionInput) {
                case 1:
                    createASandwich();
                    break;
                case 2:
                    System.out.println("Have a wonderful day!");
                    break;
                default:
                    System.out.println("Error, that option is invalid.");
                    break;
            }
        } while (optionInput != 2);






//        Beverage beverage = new Beverage("small", "sweet tea", 3.99f);
//        System.out.println(beverage);
        }
    public static void createASandwich() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please give me a size, small medium or large.");
            String size = scanner.nextLine();

            System.out.println("Please give me a bread type.");
            String bread = scanner.nextLine();

            System.out.println("Please give me meat.");
            String meat = scanner.nextLine();

            System.out.println("Please give me cheese.");
            String cheese = scanner.nextLine();

            System.out.println("Would you like any sauces?");
            Boolean sauces = scanner.nextBoolean();

            System.out.println("Would you like a side?");
            Boolean sides = scanner.nextBoolean();
            try {
                FileWriter depositFiles = new FileWriter("./src/main/java/com/iv/sandwich.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(depositFiles);

                bufferedWriter.write("\n" + size + "|" + bread + "|" + meat + "|" + cheese + "|" + sauces + "|" + sides);

                System.out.println("Sandwiched successfully!");
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Sandwich unsuccessful, error code 1053R");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}