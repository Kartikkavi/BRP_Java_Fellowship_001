// Program to find distance of line from origin.

package com.bridgelabz.boosterjavaprograms.day1;
import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;
import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        //Taking input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 point");
        int x1 = sc.nextInt();
        System.out.println("enter y1 point");
        int y1 = sc.nextInt();
        System.out.println("enter x2point");
        int x2 = sc.nextInt();
        System.out.println("enter y2 point");
        int y2 = sc.nextInt();

        //Print the Distance from origin.

        System.out.println("Distance between two end : " +Utility.distance(x1,x2,y1,y2));
    }
}
