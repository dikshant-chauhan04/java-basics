package com.basics;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String[] args) {
	int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :");
    num = sc.nextInt();
    int res = factorial(num);
    System.out.println("Factorial of "+ num + " is " + res);
    }
}
