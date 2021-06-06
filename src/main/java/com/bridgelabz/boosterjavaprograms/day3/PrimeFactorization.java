//Code to find Prime factor of number
package com.bridgelabz.boosterjavaprograms.day3;

import java.util.Scanner;

public class PrimeFactorization
{
    public static void main(String[] args)
    {
        int i =2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         int number = sc.nextInt();
       Utility.PrimeFactorization(number,i);

    }
}
