//Program to check the Nuber is Armstrong or not
package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class AramStrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int c = 0, a, temp;
        //It is the number to check armstrong
        temp = num;
        while (num > 0) {
            //if the sum of cube of all number is equal to that orignal numbber the is print the number is Aramstrong
            a = num % 10;
            num = num / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
