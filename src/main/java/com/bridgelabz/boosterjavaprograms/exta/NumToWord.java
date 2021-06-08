package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class NumToWord {
    //By the help of static we are calling the array without creating object.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int num=sc.nextInt();


        String [] units = new String[]{"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "elevel", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens=new String[] {"", "ten", "twenty", "thirty", "fourty", "fifity",
                "sixty", "seventy", "eighty", "ninety"};
        if(num < 20){
            System.out.println("Minus" + (-num));
        }
        if(num < 100){
            System.out.println(tens[num/10] + ((num%10!=0)? "  "  : "  ") + units[num%10]);
        }
        if (num<100){
            System.out.println(units[num/100] + "Hundred"+ ((num%100!=0)? "  "  : "  ") + units[num%100]);

        }

    }
}
//NOT COMPLETED YET