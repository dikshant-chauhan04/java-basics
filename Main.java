package com.basics;

import java.util.Scanner;

public class Main {
static boolean checkArmstrong(int n){
    int temp = n, sum = 0, r,p;
    p = String.valueOf(n).length();
    while(temp>0){
        r = temp%10;
        sum += Math.pow(r,p);
        temp=temp/10;
    }
   return(sum == n);
}
    public static void main(String[] args) {
	int num;
    Scanner sc = new Scanner(System.in);
        System.out.println("**** ARMSTRONG NUMBER ****");
        System.out.println("Enter the number :");
    num = sc.nextInt();
    if(checkArmstrong(num)){
        System.out.println(num + " is an armstrong number");
    }
    else {
        System.out.println(num + " is not an armstrong");
    }
    }
}
