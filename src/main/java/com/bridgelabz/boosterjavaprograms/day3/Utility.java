package com.bridgelabz.boosterjavaprograms.day3;


import java.time.chrono.MinguoDate;

public class Utility {
    public static void PrimeNum(int n1, int n2, int n3, int flag, int i) {
        for (i = n1; i <= n2; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (n3 = 2; n3 <= i / 2; ++n3) {
                if (i % n3 == 0) {
                    flag = 0;
                }
            }
            //flag =1 than i is prime number.
            //flag = 0 than i is not prime number.
            if (flag == 1)
                System.out.println(i);
        }
    }

    //Method to find Prime factor of number
    public static int PrimeFactorization(int number, int i)
    {
        //loop will Run until the condition get false.
        while (number > 1)
        {
            //print the value of i after dividing the number.
            if (number % i == 0)
            {
                System.out.println(i);
                number = number / i;
            } else
                {
                    //if the number is not divisible by 2 the incrementin value of i by 1.
                    //upto only number is divisible by itself
                i++;
            }
        }
        return number;
    }
    public static String TaylorSeries(double radian,int power,double currentTerm,double sinX,int no) {
        for (int i = 1; i < no; i++) {
            //even term is negative for that use -Math
            if (i % 2 == 0) {
                currentTerm = -Math.pow(radian, power) / getFact(power);
            } else
                {
                //odd term is positive for that use Math
                currentTerm = Math.pow(radian, power) / getFact(power);
                }
            sinX = sinX + currentTerm;
            power = power + 2;
        }
        System.out.println("sinX="+sinX);
        return "";
    }
    //To get factorials
    static int getFact(int no)
    {
        int fact = 1;
        for (int i = 1; i <= no; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
}

