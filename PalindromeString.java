package com.basics;

import java.util.Scanner;

public class PalindromeString {
  static boolean checkPalindrome(String str){
      int i=0, j=str.length()-1;

      while(i<j){
          if(str.charAt(i) != str.charAt(j))
              return false;
          i++; j--;
      }
      return true;
  }
    public static void main(String[] args) {
	String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        line = sc.nextLine();
    if(checkPalindrome(line)){
        System.out.println(line + " is a palindrome");
    }
    else{
        System.out.println(line + " is not a palindrome");
    }
    }
}
