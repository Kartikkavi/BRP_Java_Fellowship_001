package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;

import java.util.Scanner;

public class Trig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree");
        int degree = sc.nextInt();

        double sinValue=0;
        double radians=0;
        double cosValue = 0;

        Utility.Trig(degree,radians,sinValue,cosValue);
    }
}
