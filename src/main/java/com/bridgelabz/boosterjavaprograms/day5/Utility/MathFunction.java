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

    //Method to find max and min from Array
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

    //Method to get factorial of number
    public static int Fact(int number,int i,int fact)
    {
        for(i=1;i<=number;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of " + number+ " is : "+fact);
        return fact;
    }
    public static String Collinear(int x1,int x2,int x3,int y1,int y2,int y3){
        //Calculating the area of triangle and check that 3 points are Colinear or not
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
        if (a==0)
            System.out.println("Yes points are Colinear");
        else
            System.out.println("No points are not colinear");
        return "";
    }

    //Method to Find Binary
    public static String Binary(int number){
        String binary = "";
        int t=number;
        while (t>0){
            int remainder = t%2;
            t = t/2;
            binary= remainder+ binary;
        }
        System.out.println("Binary of " +number +" is :"+binary);
        return binary;
    }

    //Method for sin angle calculation
    public static double sinAngleCalculation(double number)
    {
        double calculation = Math.sin(number);
        return calculation;
    }
    //Method for cosine angle calculation
    public static double cosineAngle(double number)
    {
        double calculation = Math.cos(number);
        return calculation;
    }

    //Method to get Harmonic series
    public static String HarmonicNum(int num, double result) {
        while (num > 0) {
            result = 0.0;
            result = result + (double) 1 / num;
            num--;
            System.out.println(result + ",");
        }
        return "";
    }

}
