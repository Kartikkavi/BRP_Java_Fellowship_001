//Program For ATM machine.
package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class Atm
{
    public static void main(String[] args)
    {
        int Balance = 0;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to withdraw the amount:");
        System.out.println("Press to deposit money:");
        System.out.println("Press 3 to Check balance:");
        System.out.println("Press 4 for Exit:");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if (Balance >= withdraw)
                {
                    Balance = Balance - withdraw;

                    System.out.println("Collect the money Thank you!!!");
                    System.out.println("Remaning Balance = " + Balance);
                } else
                    {
                    System.out.println("Insuffisient funds");
                    }
                break;
            case 2:
                deposit = sc.nextInt();
                Balance = Balance + deposit;
                System.out.println(Balance);
                break;
            case 3:
                System.out.println("Balance =" + Balance);
                break;
            case 4:
                System.exit(0);
        }
    }
}


