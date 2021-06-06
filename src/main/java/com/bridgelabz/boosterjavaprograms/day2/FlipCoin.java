//Program to simulate a coin flip and print out "Heads" or
//"Tails" accordingly and finally print the percentage of Head vs Tail.
package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;
import java.util.Scanner;

public class FlipCoin
{
    public static void main(String[] args)
    {
        int loopCount = 1;
        int headCount = 0;
        int tailCount = 0;
        double result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
         int  num = sc.nextInt();
        Utility.FlipCoin(num, headCount, result, loopCount, tailCount);

    }
}
