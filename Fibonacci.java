package com.basics;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        int first , next , n, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series");
        n = sc.nextInt();
        System.out.println("Enter the starting number");
        first = sc.nextInt();
        next = first+1;
        System.out.print(first + " ");
        for (int i= 1; i<n; i++){
            res = first+next;
            System.out.print(res + " ");
            first = next;
            next = res;
        }

    }
}