/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //ask the user how many euros they are exchanging
        System.out.print("How many euros are you exchanging? ");
        int euros = in.nextInt();
        //ask the user what the exchange rate is
        System.out.print("What is the exchange rate? ");
        double exc_rate = in.nextDouble();
        //tell the user the amount of euros they entered and the exchange rate
        System.out.printf("%d euros at an exchange rate of %.4f is%n", euros, exc_rate);
        //calculate the amount of U.S. dollars the user will be getting
        double dollars = euros * exc_rate;
        //now tell the user how many dollars they'll be getting
        System.out.printf("%.2f U.S. dollars.", dollars);
    }
}
