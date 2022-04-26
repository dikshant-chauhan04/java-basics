package com.stringbasics;

public class Strings {
    public static void main(String[] args) {
// string declaration
        String str1 = "Hello ";
        String str2 = "World";
        String sen = "Hello World this is string basics program";

// length of the string
        System.out.println("length of string str1: " + str1.length());
// concatenation of the string
        System.out.println("adding string str1 and str2: " + str1 + str2);
//comparing two string as (==) may result in some errors
        int i = str1.compareTo(str2);
//return an integer value
//   0 for equal
//   +ve for first greater than second
//   -ve for first smaller than second

        if (i == 0)
            System.out.println("strings are equal ");

        else if (i < 0)
            System.out.print("strings str 1 is smaller than str2 ");

        else if (i > 0)
            System.out.println("strings str 1 is greater than str2 ");

        else System.out.println("error x_x");
// if we want to take out a substring inside of string we use substring method
// it takes 2 parameters 1. starting index 2.ending index where ending index is not included in result
// if ending index is not given it will take all the values from starting index
        System.out.println(sen.substring(sen.length() - 7));

//  charAt() method returns a character at particular index
        System.out.println("gives character at odd places in string sen ");
        for(int j=0; j<sen.length(); j=j+2){

            System.out.print(sen.charAt(j));
        }

    }
}
