package com.bridgelabz.boosterjavaprograms.day5;

import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int i =1;
        int fact =1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        //Method to find factorial of given number
        MathFunction.Fact(number,i,fact);
    }
}
