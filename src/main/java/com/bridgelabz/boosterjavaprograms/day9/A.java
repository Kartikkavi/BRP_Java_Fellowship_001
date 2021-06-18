package com.bridgelabz.boosterjavaprograms.day9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A {
     static String ccName;




    public static String compName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice =sc1.nextInt();
       // int choice =0;

        switch (choice) {
            case 1:
                ccName = sc1.next();
                break;
            case 2:

                System.out.println("NO");
                break;
        }
        return ccName;
    }
    public static void main(String[] args) {
        Boolean compName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",A.compName());
        if (compName==true){
            System.out.println("Compony Name="+ccName);
        }else {
            System.out.println("Invalid");
        }


    }
}
