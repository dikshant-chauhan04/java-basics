package com.stringbasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Your original String is : " + sb);
        for (int i =0; i<sb.length()/2; i++){
            int front = i;
            int rear = sb.length() -1 - i;
            char frontChar = sb.charAt(front);
            char rearChar = sb.charAt(rear);
            sb.setCharAt(front, rearChar);
            sb.setCharAt(rear, frontChar);
        }
        System.out.println("Your reversed String is: " + sb);
    }
}
