package com.basics;

import java.util.Scanner;

public class Prime {
    public static void checkPrime(int number){
        int m,i, flag = 0;
        m = number/2;
        if(number <= 1){
            System.out.println("not a prime");
        }
        else{
            for(i=2; i<=m; i++){
                if(number % m == 0){
                   flag = 1;
                   break;
                }
            }
            if(flag == 0) System.out.println("prime");
            else System.out.println("not prime");
            }
        }

    public static void main(String[] args) {
	int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime number or Not : ");
        n = sc.nextInt();
        System.out.println("your number is " + n);
        checkPrime(n);
    }
}
