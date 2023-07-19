package com.colab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//we struggled together :)

public class Order {
    static Scanner scanner = new Scanner(System.in);
    String optionInput;
    Sandwich sandwich = new Sandwich(); // probably wrong but ill keep it here
    public void display() {
        Checkout checkout = new Checkout();
        System.out.println("Here are your options: \n" +
                "\t1 - Place a New Order\n" +
                "\t2 - Order a drink\n" +
                "\t3 - Order chips\n" +
                "\t4 - Checkout\n" +
                "\t5 - Exit\n" +
                "Enter which one you would like: \n"
        );
        optionInput = scanner.nextLine();
        switch (optionInput) {
            case "1":
                createAnOrder();
                break;
            case "2":
                orderDrink();
                break;
            case "3":
                orderChips();
                break;
            case "4":
                checkout();
                break;
            case "5":
                System.out.println("Have a wonderful day!");
                break;
            default:
                System.out.println("Error, that option is invalid.");
                break;
        }
    }
    public void Checkout(){}
//        Beverage beverage = new Beverage("small", "sweet tea", 3.99f);
//        System.out.println(beverage);

    private void checkout() {
        System.out.println(sandwich);
    }


    public void createAnOrder() {

        try {

            System.out.println("Please choose a size: \n" +
                    "\t- small \n" +
                    "\t- medium \n" +
                    "\t- large \n"
            );
            String size = scanner.nextLine();
            sandwich.setSandwichSize(size);

            /////////////////// first error above ^^^^^^^^^^^^^^^^^^^^^^/////////////////

            System.out.println("Please choose me a bread type: \n" +
                    "\t- White\n" +
                    "\t- Wheat\n" +
                    "\t- Rye\n" +
                    "\t- Wrap\n" +
                    "\t - Lettuce\n"

            );
            String bread = scanner.nextLine();
            sandwich.getBreadTopping(bread);

            System.out.println("Please choose a meat: \n" +
                    "\t- Steak\n" +
                    "\t- Ham\n" +
                    "\t- Salami\n" +
                    "\t- Roast beef\n" +
                    "\t- Chicken\n" +
                    "\t- Bacon\n" +
                    "\t - Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnooooooooooooooooooooo\n"

            );
            String meat = scanner.nextLine();
            sandwich.getmeatTopping(meat);

            System.out.println("Please give me cheese.\n" +
                    "\t - american\n" +
                    "\t - provolone\n" +
                    "\t - cheddar\n" +
                    "\t - swiss\n" +
                    "\t - mozzarella\n" +
                    "\t - gouda\n" +
                    "\t - no\n"
            );
            String cheese = scanner.nextLine();
            sandwich.getCheeseTopping(cheese);


            System.out.println("Would you like any Sides? y or n: ");
            String wantSauce = scanner.nextLine();

            if (wantSauce.equalsIgnoreCase("y")) {
                chooseASauce();
//                String sauceAnswer = scanner.nextLine();
//                sandwich.getSauce(sauceAnswer);

                System.out.println("Hey you trynna get a side of DN as well or nah? y or n: ");
                String wantSide = scanner.nextLine();

                if(wantSauce.equalsIgnoreCase("y")) {
                    chooseASide();
//                    String userSideChoice = scanner.nextLine();
//                    sandwich.getSide(userSideChoice);

                } else if (wantSide.equalsIgnoreCase("n")) {
                    System.out.println("thanks for wasting my time then I guess, bye.");

                }

                else {
                    System.out.println("please stop being slow, answer correctly.");
                }

            } else if (wantSauce.equalsIgnoreCase("n")) {
                System.out.println("Do you want any sides? y or n:");
                String sideAnswer = scanner.nextLine();

                if (sideAnswer.equalsIgnoreCase("y")) {
                    chooseASide();
//                    String userSideChoice = scanner.nextLine();
//                    sandwich.getSide(userSideChoice);

                } else if (sideAnswer.equalsIgnoreCase("n")) {
                    System.out.println("Not much of a fun-seeking-joy-loving-\n" +
                            "experience-driven-semi-humanoid-being then i guess... \n" +
                            "huh who woulda thunk.");

                } else {
                    System.out.println("Error code: B0Z0-413R7!");
                }
            } else {
                System.out.println("stop making mistakes or else...");
            }try {
                FileWriter depositFiles = new FileWriter("./src/main/java/com/colab/sandwich.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(depositFiles);

                bufferedWriter.write("\n" + size + "|" + bread + "|" + meat + "|" + cheese + "|" + "Mayo" + "|" + "Au jus");

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
            String chipAndDrink = scanner.nextLine();
            if (chipAndDrink.equalsIgnoreCase("1")) {
                orderChips();
            } else if (chipAndDrink.equalsIgnoreCase("2")) {
                orderDrink();
            } else if (chipAndDrink.equalsIgnoreCase("3")) {
                orderChips();
                orderDrink();
            } else if (chipAndDrink.equalsIgnoreCase("4")) {
                checkout();
            } else {
                System.out.println("please help.");
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

        String chipChoice = scanner.nextLine();

        switch (chipChoice) {
            case "1":
                sandwich.addSide("Doritos");
                break;
            case "2":
                sandwich.addSide("Kettle cooked Jalapeno Chips");
                break;
            case "3":
                sandwich.addSide("Barbeque Lays");
                break;
            case "4":
                sandwich.addSide("Chex Mix");
                break;
            case "5":
                sandwich.addSide("Smart Cheddar Popcorn");
                break;
            default:
                System.out.println("something went wrong, please try again.");
                break;
        }
    }

    public void orderDrink() {

        System.out.println("What kind of drinks do you want?\n"
                + "\t1 - Water\n"
                + "\t2 - Dr. Pepper\n"
                + "\t3 - Sprite\n"
                + "\t4 - Lemonade\n"
                + "\t5 - Sweet Tea\n"
        );

        String drinkChoice = scanner.nextLine();

        switch (drinkChoice) {
            case "1":
                sandwich.addSauce("Water");
                break;
            case "2":
                sandwich.addSauce("Dr. Pepper");
                break;
            case "3":
                sandwich.addSauce("Sprite");
                break;
            case "4":
                sandwich.addSauce("Lemonade");
                break;
            case "5":
                sandwich.addSauce("Sweet Tea");
                break;
            default:
                System.out.println("something went wrong, please try again.");
                break;
        }
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
                sandwich.addSide("Au Jus");
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
