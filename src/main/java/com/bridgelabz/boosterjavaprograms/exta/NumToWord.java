package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class NumToWord {
    //By the help of static we are calling the array without creating object.


    public static final String[] units = {"zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "elevel", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static final String[] tens = new String[]{"", "", "twenty", "thirty", "fourty", "fifity",
            "sixty", "seventy", "eighty", "ninety"};

    public static String convert(int num) {
        if (num < 0) {
            return "Minus" + convert(-num);
        }

        if (num < 20) {
            return units[num];
        }
        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? "  " : "  ") + units[num % 10];
        } else if (num < 1000) {
            return units[num / 100] + " Hundred and" + ((num % 100 != 0) ? " " : " ") + convert(num % 100);
        }if(num<1000){
            return units[num/1000] + " Thousand " +((num%1000!=0)? "" : "") + convert(num%1000);

        }

        return "";
    }


    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
         num = sc.nextInt();
         System.out.println(convert(num));

    }
}
//NOT COMPLETED YET