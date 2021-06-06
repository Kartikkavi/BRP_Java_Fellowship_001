//Code to print Taylor series
package com.bridgelabz.boosterjavaprograms.day3;

import java.util.Scanner;

public class TaylorSeries
{
    public static void main(String[] args) throws Exception
    {
        //Taking input from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms");
        int no = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the theta");
        int theta = sc2.nextInt();

        //Convert the value degree to radian.
        double radian = Math.toRadians(theta);
        System.out.println("Value of Degree to Radian=" + radian);
        int power = 1;
        double currentTerm = 0.0;
        double sinX = 0.0;

       Utility.TaylorSeries(radian,power,currentTerm,sinX,no);
    }
}
