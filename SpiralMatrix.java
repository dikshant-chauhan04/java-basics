package com.arrayjavabasic;

import java.util.Scanner;

public class ElemSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        System.out.println("Enter the elements of array");
        for(int i=0; i<rows; i++) {
            for (int j =0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
//        output of the matrix in spiral matrix form
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        int dir = 1;
        while (top <= bottom && left <= right){
            if(dir == 1){
                for(int i = left; i<=right; i++  ){
                    System.out.print(numbers[top][i] + " ");
                }
                ++top;
                dir =2;
            }
            else if(dir == 2){
                for(int i = top; i<=bottom; i++){
                    System.out.print(numbers[i][right] + " ");
                }
                --right;
                dir = 3;
            }
            else if(dir == 3){
                for(int i = right; i>=left ; i--){
                    System.out.print(numbers[bottom][i] + " ");
                }
                --bottom;
                dir = 4;
            }

            else if(dir == 4){
                for(int i = bottom ; i>=top ; i--){
                    System.out.print(numbers[i][left] + " ");
                }
                ++left;
                dir = 1;
            }

        }



    }
}


