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

//        Sandwich sandwich = new Sandwich(); // probably wrong but ill keep it here

        try {
            System.out.println("Please give me a four inch, eight inch or twelve inch.");
            String size = scanner.nextLine();

//            Sandwich sandwich = new Sandwich(size); // not sure if this is how im supposed to be using it

            System.out.println("Please choose me a bread type: \n" +
                "\t- white\n" +
                "\t- wheat\n" +
                "\t- rye\n" +
                "\t- wrap\n"
            );
            String bread = scanner.nextLine();

            System.out.println("Please choose a meat: " +
                    "\t- steak\n" +
                    "\t- ham\n" +
                    "\t- salami\n" +
                    "\t- roast beef\n" +
                    "\t- chicken\n" +
                    "\t- bacon\n"
            );
            String meat = scanner.nextLine();

            System.out.println("Please give me cheese.");
            String cheese = scanner.nextLine();

            System.out.println("Would you like any sauces? y or n");
            String sauces = scanner.nextLine();
            if (sauces.equals("y")){
                chooseASauce();
            } else {
                chooseASide();
            }

            System.out.println("Would you like a side? y or n");
            String sides = scanner.nextLine();

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
    public static void chooseASauce(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        System.out.println("Please choose from our assortment: \n" +
            "\t 1- Mayo\n" +
            "\t 2- Mustard\n" +
            "\t 3- Ketchup\n" +
            "\t 4- Ranch\n" +
            "\t 5- Thousand Islands\n" +
            "\t 6- Vinaigrette\n"
        );
        switch (userInput){
            case 1:

        }
    }
    public static void chooseASide(){
        System.out.println("Please choose from our assortment: " +
                "\t 1- au jus\n" +
                "\t 2- sauce\n"
        );
    }
}