package com.bridgelabz.boosterjavaprograms.day5.Utility;

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
}
