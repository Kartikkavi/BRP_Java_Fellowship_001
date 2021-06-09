//Program to check Prime number or not25

package com.bridgelabz.boosterjavaprograms.day5;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
