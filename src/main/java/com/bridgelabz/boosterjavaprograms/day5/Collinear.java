//Program to check the three point are collinear or not using
//area of trangle.
package com.bridgelabz.boosterjavaprograms.day5;

import java.util.Scanner;

public class Collinear {
    public static void main(String[] args) {
        int x1,x2,x3,y1,y2,y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vale of x1,x2,x3,y1,y2,y3");
        x1 = sc.nextInt();
        x2=sc.nextInt();
        x3 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println(" "+x1+ " "+x2+ " "+x3+ " "+y1+ " "+y2+ " "+y3 );
        //Calculating the area of triangle.
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
        if (a==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
