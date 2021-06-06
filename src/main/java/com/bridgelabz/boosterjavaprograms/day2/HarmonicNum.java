//Program to get Harmonic series.
package com.bridgelabz.boosterjavaprograms.day2;
import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;
import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        int num;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        Utility.HarmonicNum(num, result);
    }
}
