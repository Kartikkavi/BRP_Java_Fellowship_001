package com.bridgelabz.boosterjavaprograms.day5.Utility;

import java.util.Arrays;

//Method to Check the Number is Prime or Not
public class MathFunction {
    public static int PrimeNumber(int num){
        //Number is prime when it only divisible by 1 or itself.
        int temp =0;
        for (int i =2;i<num-1;i++)  //use for loop to check is num is divisible by any other number expect itself.
        {
            if(num % i==0)//if (num % i==0) it mean num is divisible by another num also .
            {
                temp =temp+1;   //then we increment temp by 1.
            }
        }
        if (temp>0)
        {
            System.out.println("Number is not prime number");
        }else
        {
            System.out.println("Number is  prime number");
        }
        return num;
    }
    //Method to find Maximum and Minimum String from Array
    public static String MaxString(String[] array)
    {
        //Sorting an array.
        //And Print sort array
        System.out.println("Sorted Array");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Max String==="  +array[array.length-1]);
        System.out.println("Min String==="  +array[0]);
        return "";
    }
    public static void MaxMinIntArray(int[] array)
    {
        int smalest =array[0];
        int secondsmalest = array[1];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] <smalest)
            {
                secondsmalest = smalest;
                smalest = array[i];
            }
            else if(array[i] < secondsmalest && array[i]!=smalest)
            {
                secondsmalest=array[i];
            }
        }
        System.out.println("2nd smallest value= "+secondsmalest);
        System.out.println("1st smallest value= "+smalest);
    }

}
