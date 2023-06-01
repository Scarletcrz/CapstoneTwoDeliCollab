package com.colab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Order {
    static Scanner scanner = new Scanner(System.in);
    int optionInput;

    Sandwich sandwich = new Sandwich(); // probably wrong but ill keep it here
    public void display() {
        do {
            System.out.println("Here are your options: \n" +
                    "\t1 - Place a New Order\n" +
                    "\t2 - Order a drink\n" +
                    "\t3 - Order chips\n" +
                    "\t4 - Exit\n" +
                    "Enter which one you would like: \n"
            );
            optionInput = scanner.nextInt();

            switch (optionInput) {
                case 1:
                    scanner.nextLine();
                    createAnOrder();
                    break;
                case 2:
                    orderDrink();
                    break;
                case 3:
                    orderChips();
                    break;
//                case 4:
//                    checkout();
//                    break;
                case 5:
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


    public void createAnOrder() {

        try {
//            Sandwich sandwich = new Sandwich(); // not sure if this is how im supposed to be using it

            System.out.println("Please choose a size: \n" +
                    "\t- small \n" +
                    "\t- medium \n" +
                    "\t- large sandwich.\n"
            );
            String size = scanner.nextLine();
            sandwich.setSandwichSize(size);

            /////////////////// first error above ^^^^^^^^^^^^^^^^^^^^^^/////////////////

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
            String wantSauce = scanner.nextLine();
//            Scanner scanner = new Scanner(System.in);

            if (wantSauce.equalsIgnoreCase("y")) {
                chooseASauce();
                int sauceAnswer = scanner.nextInt();
            } else if (wantSauce.equalsIgnoreCase("n")) {
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
            try {
                FileWriter depositFiles = new FileWriter("./src/main/java/com/colab/sandwich.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(depositFiles);

//                bufferedWriter.write("\n" + size + "|" + bread + "|" + meat + "|" + cheese + "|" + sauceAnswer + "|" + sideAnswer);

                System.out.println("Sandwiched successfully!");
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Sandwich unsuccessful, error code 1053R");
                e.printStackTrace();
            }
            System.out.println("\nThank you for creating that wonderful sandwich, \n" +
                    "before we move on to the purchasing of said sandwich, \n" +
                    "would you like to order chips and/or a drink? \n"
                    + "\t1 - Chips only: \n"
                    + "\t2 - Drinks only: \n"
                    + "\t3 - Both: \n"
                    + "\t4 - neither. . . (boringggggg *zzzzzzz*)\n");
            int chipAndDrink = scanner.nextInt();
            if (chipAndDrink == 1 || chipAndDrink == 3) {
                orderChips();
            } else if (chipAndDrink == 2) {
                orderDrink();
            } else if (chipAndDrink == 4) {
                // get receipt somehow
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void orderChips() {
        System.out.println("What kind of chips do you want?\n"
                + "\t1 - Doritos\n"
                + "\t2 - Kettle cooked Jalapeno chips\n"
                + "\t3 - Barbeque Lays\n"
                + "\t4 - Chex Mix\n"
                + "\t5 - Smart Cheddar Popcorn\n"
        );

        int chipChoice = scanner.nextInt();


    }

    public void orderDrink() {
        System.out.println("What kind of drinks do you want?\n"
                + "\t1 - Water\n"
                + "\t2 - Dr. Pepper\n"
                + "\t3 - Sprite\n"
                + "\t4 - Lemonade\n"
                + "\t5 - Sweet Tea\n"
        );

        int drinkChoice = scanner.nextInt();


    }

    public void chooseASauce() {

        System.out.println("Please choose one option from our assortment: \n" +
                "\t 1- Mayo\n" +
                "\t 2- Mustard\n" +
                "\t 3- Ketchup\n" +
                "\t 4- Ranch\n" +
                "\t 5- Thousand Islands\n" +
                "\t 6- Vinaigrette\n"
        );

        String sauceChoice = scanner.nextLine();

//        if (sauceChoice != 6) ;
        switch (sauceChoice) {
            case "1":
                sandwich.addSauce("MaYo");
                break;
            case "2":
                sandwich.addSauce("Mustard");
                break;
            case "3":
                sandwich.addSauce("Ketchup");
                break;
            case "4":
                sandwich.addSauce("Ranch");
                break;
            case "5":
                sandwich.addSauce("Thousand Islands");
                break;
            case "6":
                sandwich.addSauce("Vinaigrette");
                break;
            default:
                System.out.println("something went wrong, please try again.");
                break;
        }
    }
    public void chooseASide () {
        System.out.println("Please choose from our sides: \n" +
                "\t 1- au jus\n" +
                "\t 2- sauce\n"
        );
        String sideAnswer = scanner.nextLine();

        switch (sideAnswer) {
            case "1":
                String side = Integer.toString(1);
                break;
            case "2":
                chooseASauce();
                break;
            default:
                System.out.println("something went wrong, please try again.");
                break;
        }
    }
}

