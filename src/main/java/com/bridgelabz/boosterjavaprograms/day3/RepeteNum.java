//Code to find the Duplicate numbers in array from 0 to 100.

package com.bridgelabz.boosterjavaprograms.day3;

import java.util.Arrays;

public class RepeteNum
{
    public static void main(String[] args)
    {
        //Initialize array
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("The orignal Array");
        System.out.println(Arrays.toString(arr)); //Print the Array
        System.out.println();

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}