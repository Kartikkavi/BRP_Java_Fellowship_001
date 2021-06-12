package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println("1st string =" + str1);
        System.out.println("2st string =" + str2);

        //Convert both the String to lower case
        System.out.println(str1 = str1.toLowerCase());
        System.out.println(str2 = str2.toLowerCase());


        //if the length of two string is not equal to each other the two string
        //is not anagram.
        if (str1.length() != str2.length()) {
            System.out.println("Two string are not Anagram");
        } else {
            //Convert String to char
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the arrays using in-built function sort ()
            Arrays.sort(string1);
            Arrays.sort(string2);

            //Comparing both the arrays using in-built function equals ()
            if (Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}


