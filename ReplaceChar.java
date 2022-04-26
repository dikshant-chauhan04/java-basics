package com.stringbasics;

public class ReplaceChar {
    public static void main(String[] args) {

        String str = "aaaaaaaadsf;lajsfdl;jasfl";
        String newStr = "" ;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == 'a'){
                newStr += 'i';
            }
            else
            {
                newStr += str.charAt(i);
            }
        }
        System.out.println("Old string : " + str +"\nNew String : " + newStr);
    }
}
