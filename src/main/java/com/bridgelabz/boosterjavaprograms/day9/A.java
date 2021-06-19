package com.bridgelabz.boosterjavaprograms.day9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A {
     static String ccName;

     public static String compName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice =sc1.nextInt();


        switch (choice) {
            case 0:
                ccName = sc1.next();
                System.out.println("Compony Name="+ccName);
                break;
            case 1:

                System.out.println("Not intrested");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        return ccName;
    }
    public static void main(String[] args) {

        A.compName();


    }
}
