package com.bridgelabz.boosterjavaprograms.day1;

import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;
import java.util.Scanner;

public class SpringSession
{
    public static void main(String[] args)
    {
    //Taking input from user and check the condition and print the result.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month :");
        int month = input.nextInt();

        System.out.println("Enter Day");
        int day = input.nextInt();
        //Called the method from Utility
        Utility.SpringSession( day, month);

    }
}
