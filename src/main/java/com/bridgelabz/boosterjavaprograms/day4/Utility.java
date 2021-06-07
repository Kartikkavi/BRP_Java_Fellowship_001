package com.bridgelabz.boosterjavaprograms.day4;

public class Utility
{

    //Method to check if the given Strings are palindrome or not
    public static void checkPalindrome(String str)
    {
        String rev = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}

