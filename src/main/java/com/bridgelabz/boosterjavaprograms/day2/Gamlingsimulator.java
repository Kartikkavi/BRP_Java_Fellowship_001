//Code  gambler starts with certain stake
//in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
//input. Keeps track of the number of times won and number of bets made. Run the
//simulation N times.
//Input - stake, goal and trails are taken as input
//Output - Number of times won, Percent Win and Avg number of bets made.
package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.util.Utility.Utility;

import java.util.Scanner;
public class Gamlingsimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stake value: ");
        int Stake = sc.nextInt();
        System.out.println("Enter Goal value: ");
        int Goal = sc.nextInt();
        System.out.println("Enter number of times: ");
        int Trails = sc.nextInt();
        Utility.Gamlingsimulator(Stake,Goal, Trails);

    }
}
