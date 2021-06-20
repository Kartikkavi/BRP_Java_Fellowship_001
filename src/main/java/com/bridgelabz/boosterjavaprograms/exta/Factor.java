package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class Factor
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int num =scanner.nextInt();
        System.out.println(num);
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i + " ");
            }
        }
    }

}