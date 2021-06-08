package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i;
        int a = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Count");
//        int a= sc.nextInt();
        System.out.println(n1 + "    " + n2);//Print 0 and 2.

        System.out.println("Fibonacci series");
        for (i = 2; i < a; i++)//loop start from 2 because 0 and 1 is already print.
        {
            n3 = n1 + n2;
            System.out.println();
            System.out.println("" + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
