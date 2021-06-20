// Code to check if the given two strings are an Anagram.
package com.bridgelabz.boosterjavaprograms.day4;


import com.bridgelabz.boosterjavaprograms.day4.Util.Utility;

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        // take input from users
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

       Utility.Anagram(str1, str2);

    }
}


