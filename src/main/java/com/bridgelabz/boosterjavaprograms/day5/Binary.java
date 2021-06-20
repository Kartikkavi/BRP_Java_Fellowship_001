//Program to find Binary of Number
package com.bridgelabz.boosterjavaprograms.day5;
import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.util.Scanner;

public class Binary
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = scan.nextInt();
        MathFunction.Binary(number);
    }
}
