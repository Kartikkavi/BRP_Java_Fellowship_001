// Java program to find the prime numbers
// between a given interval

package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.util.Utility.day3.Utility;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Decleare the variables.
        int n1=0, n2=0, n3=0, i=0, flag=0;
        //Taking the input from user.
        System.out.println("Enter the lower interval");
        n1 = scanner.nextInt();

        System.out.println("Enter the Upper interval");
        n2 = scanner.nextInt();
        // Traverse each number in the interval
        // with the help of for loop
        Utility.PrimeNum(n1,n2,n3,flag,i);
    }
}
