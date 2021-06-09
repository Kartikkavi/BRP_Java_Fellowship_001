//Program to find max and min from String Array.
package com.bridgelabz.boosterjavaprograms.day5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxString
{
    public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Enter the names");
        //initiallizing the place and print string from 0th index to array.length.
        for (int i = 0;i < array.length;i++)
        {
            array[i] =sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        //Sorting an array.
        //And Print sort array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Max String==="  +array[array.length-1]);
        System.out.println("Min String==="  +array[0]);
    }
}
