//Program to check the number is Automorphic Number or not.
package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int square = num * num;
        int c = 0;System.out.println(num);
        //Assinging the value of num to temp
        int temp = num;
        while (temp > 0)
        {
            c++;//incrementing counter

            //Taking quationt of the number
            temp = temp / 10;
        }
        int lastDigit = square % (int) Math.pow(10, c);//check the last digit of the square square/100.
        if (num == lastDigit) {
            System.out.println("Automorphic Number");
        } else
            {
            System.out.println(" Not Automorphic Number");
            }
//
//        int squ = num * num;
//        System.out.println(squ);
//
//        //if the last two digits of square of number is equal to orignal number the called as Automorpic number.
//        String number = Integer.toString(num);
//        String square = Integer.toString(squ);
//
//        if (square.endsWith(number))
//            System.out.println("Automorphic Number");
//        else
//            System.out.println("not Automorphic Number");
    }
}