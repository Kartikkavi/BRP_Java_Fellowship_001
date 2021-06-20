//Program to find Cosin Angle
package com.bridgelabz.boosterjavaprograms.day5;
import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;
import java.util.Scanner;

public class cosineAngle
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(MathFunction.cosineAngle(number));
    }
}
