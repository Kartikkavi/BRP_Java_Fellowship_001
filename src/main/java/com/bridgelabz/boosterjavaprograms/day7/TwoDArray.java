//Program to Print 2D array
package com.bridgelabz.boosterjavaprograms.day7;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //Taking input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want");
        int row = sc.nextInt();
        System.out.println("Enter how many cols you want");
        int cols = sc.nextInt();
        //Declear  2D Array
        int[][] matA = new int[row][cols];
        System.out.println("Enter " + (row * cols) + " values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matA[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //Arrange the userinput in matrix format
        System.out.println("Orignal Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
