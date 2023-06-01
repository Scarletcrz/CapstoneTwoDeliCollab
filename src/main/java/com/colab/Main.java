package com.colab;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.display();
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