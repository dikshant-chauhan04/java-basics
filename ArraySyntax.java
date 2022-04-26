package com.arrayjavabasic;

import java.util.Scanner;

public class ArraySyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        System.out.println("enter the elements of array");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter number to check inside array");
        int x = sc.nextInt();

     for(int i=0; i<numbers.length; i++) {
         if(numbers[i] == x)
            System.out.println("index of number is " + i );
        }

    }
}
