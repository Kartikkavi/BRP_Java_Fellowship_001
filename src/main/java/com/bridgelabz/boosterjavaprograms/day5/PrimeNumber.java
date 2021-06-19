//Program to check Prime number or not.

package com.bridgelabz.boosterjavaprograms.day5;
import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        MathFunction.PrimeNumber(num);

    }
}
