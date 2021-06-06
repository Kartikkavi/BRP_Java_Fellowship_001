//Code to get Sum of two number after two dice roll
package com.bridgelabz.boosterjavaprograms.day1;

import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;

public class SumOfTwoDice
{
    public static void main(String[] args)
    {
    //Taking the two random number after dice roll.

        int dice1 = (int) (Math.random() * 6) + 1;
        System.out.println("Dice 1 :" + dice1);
        int dice2 = (int) (Math.random() * 6) + 1;
        System.out.println("Dice 2 :" + dice2);

        System.out.println("Sum of two Dice is :" + Utility.SumOfTwoDice(dice1,dice2));
    }
}