package com.basics;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
	double num;
    int max,min;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        System.out.println("Minimum number: ");
    min = sc.nextInt();
        System.out.println("Maximum number: ");
    max = sc.nextInt();

    num = Math.random()*((max-min) + 1)+min;
        System.out.println("Random number between " + min + " and " + max + " is: " + Math.floor(num));
    }
}
