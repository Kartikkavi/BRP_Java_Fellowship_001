//Program to find max and min from String Array.
package com.bridgelabz.boosterjavaprograms.day5;
import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;
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
        for (int i = 0;i < array.length;i++)
        {
            array[i] =sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        MathFunction.MaxString(array);
    }
}
