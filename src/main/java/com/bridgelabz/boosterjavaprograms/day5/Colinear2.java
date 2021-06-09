package com.bridgelabz.boosterjavaprograms.day5;

import java.util.Scanner;

public class Colinear2 {
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

        if ((y3 - y2) * (x2 = x1)== (y2 - y1)*(x3 - x2))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
