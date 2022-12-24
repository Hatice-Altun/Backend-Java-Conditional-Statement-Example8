package com.altun.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program in Java to input 5 numbers and find their sum and average.

        System.out.println("Welcome!");
        System.out.println("Input the 5 numbers : ");
        {
            int i, n = 0, s = 0;
            double avg;

            for (i = 0; i < 5; i++) {
                Scanner userInteraction = new Scanner(System.in);
                n = userInteraction.nextInt();

                s += n;
            }
            avg = s / 5;
            System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);
        }
    }
}
