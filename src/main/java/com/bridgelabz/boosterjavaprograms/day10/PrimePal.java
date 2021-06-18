package com.bridgelabz.boosterjavaprograms.day10;

import java.util.Scanner;

public class PrimePal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the want to check");
        int num = sc.nextInt();
        int remainder;
        int reverse = 0;
        int temp = num;
        boolean isPrime = true;
        int i = 2;
        while (i < temp / 2) {
            if (temp % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println("The number is prime number");
        } else {
            System.out.println("The number is not prime number");
        }
        while (num > 0) {
            //Reversing the Number.
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if (temp == reverse) {
            System.out.println("number is palindrom number ");
        } else {
            System.out.println("number is not  palindrom number ");
        }
    }
}
