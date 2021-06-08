package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class PetersonNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPeterson(n))
        {
            System.out.println("is Peterson ========" + n);
        } else
            {
            System.out.println("is not Peterson ========" + n);
             }
    }
    static boolean isPeterson(int n)
    {
        int num = n;
        int sum = 0;
        while (n > 0)
        {
            int digit = n % 10;   //Store the last value in digit
            sum = sum + fact(digit);
            n = n / 10;
        }
        return (sum == num);
    }
    static int fact(int n)
    {
        if (n == 1)
            return 1;
        else
            {
            int z;
            z = n * fact(n - 1);
            return (z);
            }
    }
}
