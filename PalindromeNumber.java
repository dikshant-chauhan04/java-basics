package com.basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean checkPalindrome(long number){
        long temp,r, sum=0;
        temp = number;
        while (number>0){
            r = number%10;
            sum = (sum*10)+r;
            number = number/10;
        }
        return sum == temp;
    }
    public static void main(String[] args) {
	long num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be checked:");
        num = sc.nextLong();

    if(checkPalindrome(num)){
        System.out.println("it is palindrome");
    }
    else {
        System.out.println("not a palindrome");
    }
    }
}
