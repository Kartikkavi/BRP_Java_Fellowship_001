//Program to Check Number is Palindrom or Not
package com.bridgelabz.boosterjavaprograms.day4;
import com.bridgelabz.boosterjavaprograms.day4.Util.Utility;
import java.util.Scanner;

public class Palindrom
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Utility.checkPalindrome(str);

    }
}
