package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i;
        int fact =1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        //Method to find factorial of given number
        for(i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of" +number+ "is: "+fact);
    }
}
