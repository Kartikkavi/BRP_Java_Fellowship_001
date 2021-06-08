//Program to check the number is Sunny number or not.
//A number is called a sunny number if the number next to the given number is a
// perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.
package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class SunnyNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        double square, d;
        square = Math.sqrt(num + 1);
        System.out.println("Square root of num+1=====" + square);

        d = square - Math.floor(square);
        System.out.println("Value od d===========" + d);
        //here we check that value of d =0.
        System.out.println("Check the d==0 or not if d==0 is Sunny Number othrwise not Sunny Number");
        if (d == 0.0)
        {
            System.out.println("Number is Sunny Number");
        } else
            {
            System.out.println("Number is not Sunny Number");
            }
    }
}
