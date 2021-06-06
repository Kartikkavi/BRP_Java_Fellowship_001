package com.bridgelabz.boosterjavaprograms.util.Utility.day3;

public class Utility
{
    public static void PrimeNum(int n1,int n2,int n3,int flag,int i)
    {
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
}
