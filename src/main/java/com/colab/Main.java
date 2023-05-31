package com.colab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
//                case 2:
//                    orderDrink();
//                    break;
//                case 3:
//                    orderChips();
//                    break;
//                case 4:
//                    checkout();
//                    break;
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

//        Sandwich sandwich = new Sandwich(); // probably wrong but ill keep it here
        try {
            System.out.println("Please give me a four inch, eight inch or twelve inch.");
            String size = scanner.nextLine();

            Sandwich sandwich = new Sandwich(size); // not sure if this is how im supposed to be using it

            System.out.println("Please choose me a bread type: \n" +
                    "\t- white\n" +
                    "\t- wheat\n" +
                    "\t- rye\n" +
                    "\t- wrap\n"
            );
            String bread = scanner.nextLine();

            System.out.println("Please choose a meat: \n" +
                    "\t- steak\n" +
                    "\t- ham\n" +
                    "\t- salami\n" +
                    "\t- roast beef\n" +
                    "\t- chicken\n" +
                    "\t- bacon\n"
            );
            String meat = scanner.nextLine();

            System.out.println("Please give me cheese.\n" +
                    "\t 1- american\n" +
                    "\t 2- provolone\n" +
                    "\t 3- cheddar\n" +
                    "\t 4- swiss\n" +
                    "\t 5- mozzarella\n" +
                    "\t 6- gouda\n"
            );
            String cheese = scanner.nextLine();


//        while (true) {
//            System.out.println();
            System.out.println("Would you like any sauces? y or n: ");
            String sauces = scanner.nextLine();
//            Scanner scanner = new Scanner(System.in);

            if (sauces.equalsIgnoreCase("y")) {
                chooseASauce();
            } else if (sauces.equalsIgnoreCase("n")) {
                System.out.println("Do you want any sides? y or n:");
                String sideAnswer = scanner.nextLine();
                if (sideAnswer.equalsIgnoreCase("y")) {
                    chooseASide();
                } else if (sideAnswer.equalsIgnoreCase("n")) {
                    System.out.println("Not much of a fun-seeking-joy-loving-\n" +
                            "experience-driven-semi-humanoid-being then i guess... \n" +
                            "huh who woulda thunk.");
                } else {
                    System.out.println("Error code: B0Z0-413R7!");
                }
            } else {
                System.out.println("stop making mistakes or else...");
            }
            System.out.println("\nThank you for creating that wonderful sandwich, \n" +
                "before we move on to the purchasing of said sandwich, \n" +
                "would you like to order chips and/or a drink? \n"
                + "\t1 - Chips only: \n"
                + "\t2 - Drink only: \n"
                + "\t3 - Both only: \n"
                + "\t4 - neither. . . (boringggggg *zzzzzzz*)\n");
            String chipAndDrink = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    public static void chooseASauce() {

        System.out.println("Please choose one option from our assortment: \n" +
                "\t 1- Mayo\n" +
                "\t 2- Mustard\n" +
                "\t 3- Ketchup\n" +
                "\t 4- Ranch\n" +
                "\t 5- Thousand Islands\n" +
                "\t 6- Vinaigrette\n"
        );

        String userInput = scanner.nextLine();

//        while (userInput != "6") ;
//        System.out.println();
//        switch (userInput){
//            case 1:;
//                sand.add("Mayo");

    }
    public static void chooseASide () {
        System.out.println("Please choose from our sides: \n" +
                "\t 1- au jus\n" +
                "\t 2- sauce\n"
        );
        String sideAnswer = scanner.nextLine();
    }
}

//            try {
//                FileWriter depositFiles = new FileWriter("./src/main/java/com/colab/sandwich.txt", true);
//                BufferedWriter bufferedWriter = new BufferedWriter(depositFiles);
//
//                bufferedWriter.write("\n" + size + "|" + bread + "|" + meat + "|" + cheese + "|" + sauces + "|" + sides);
//
//                System.out.println("Sandwiched successfully!");
//                bufferedWriter.close();
//            } catch (Exception e) {
//                System.out.println("Sandwich unsuccessful, error code 1053R");
//                e.printStackTrace();
//            }
//        }