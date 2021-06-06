/*****************************************************************
 * Purpose : This code is written to combination of all day1,day2 and day3 classes.
 *
 *
 * @since 2 jun 2021
 *****************************************************************/

package com.bridgelabz.boosterjavaprograms.util.Utility;

import java.util.Scanner;

public class Utility {
    //Find the distance between two point.

    public static double distance(int x1, int x2, int y1, int y2) {
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    //Code to check that which year is leap year or not.
    public static String leapYear() {
        //Taking input from user and check that is that year is leap year or not

        System.out.println("Enter year....");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            //If the above condition is get true then given year is leap year otherwise not.
            System.out.println(year + " Is a leap Year");
        else
            System.out.println(year + " Is Not a Leap Year");
        //Return the String.

        return "";
    }

    // Method to find Root of Quadratic equation.

    public static String findQuadratic() {
        //initialed the variables.
        double a, b, c;
        double root1;
        double root2;
        //Taking input from user and find the roots.
        System.out.println("Enter the value of a, b, c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        //If the value of delta is greater than zero.
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root1 : " + root1);
            System.out.println("Root2 : " + root2);
            //If the valude of delta is equal to zero.
        } else if (delta == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);
        }
        return "";
    }

    //Method to get Sum of Two random number after dice roll.

    public static int SumOfTwoDice(int dice1, int dice2) {
        //Making sum and return the sum.

        int sum = dice1 + dice2;
        return sum;
    }
    //Method to check and prints true if day d of month m is between March 20 (m = 3, d
    //=20) and June 20 (m = 6, d = 20), false otherwise.

    public static String SpringSession(int day, int month) {

        if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30)
                || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("true");
        } else
            System.out.println("false");
        return "";
    }

    //Method to reverse the given number.

    public static int ReverseNumber(int num) {
        int remainder = 0, reversed = 0;
        while (num > 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }

    //Code to reverse the given number.

    public static int add(int fno, int sno) {

        return fno + sno;
    }

    // Program by taking a, b and c as input values and print the
    //following integer operations a + b *c, a * b + c, c + a / b, and a % b + c.

    public static void calculation() {
        System.out.println("Enter three numbers for calculation ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scan.nextInt();
        System.out.println("Enter second number ");
        int b = scan.nextInt();
        System.out.println("Enter third number ");
        int c = scan.nextInt();

        int sum = a + b + c;
        int multiply = a * b * c;
        int divide = c + a / b;
        int mod = a % b + c;

        System.out.println("the sum of the given numbers: " + sum);
        System.out.println("the product of the given numbers: " + multiply);
        System.out.println("the division calculation of the given numbers: " + divide);
        System.out.println("the mod calculation of the given numbers: " + mod);
    }
    //Method to find the number of win and loss.

    public static void Gamlingsimulator(int Stake, int Goal, int Trails) {
        int bets = 0;
        int wins = 0;

        for (int i = 0; i < Trails; i++) {
            int cash = Stake;

            while (cash > 0 && cash < Goal) {
                bets++;

                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == Goal)
                wins++;
        }
        System.out.println();
        System.out.println(wins + " wins of " + Trails);
        System.out.println("Percent of games won = " + 100.0 * wins / Trails);
        System.out.println("Avg # bets           = " + 1.0 * bets / Trails);
    }

    //Method to get Harmonic series
    public static String HarmonicNum(int num, double result) {
        while (num > 0) {
            result = 0.0;
            result = result + (double) 1 / num;
            num--;
            System.out.println(result + ",");
        }
        return "";
    }

    //Program to simulate a coin flip and print out "Heads" or
    //"Tails" accordingly and finally print the percentage of Head vs Tail.
    public static String FlipCoin(double num, double headCount, double result, double loopCount, double tailCount) {
        //Run the loop until the condition get false
        while (loopCount < num) {
            //toss the coin randomly
            result = Math.random();
            if (result <= .5) {
                headCount++;   //incremneting the headcount.
                //Print the result
                System.out.println("is heads.");
            } else {
                tailCount++;
                System.out.println(" is tails.");
            }
            loopCount = loopCount + 1;
        }
        //Check the max number of time win.
        if (headCount > tailCount) {
            System.out.println("Head Wins");
        } else {
            System.out.println("Tail Wins");
        }

        return "";
    }

    //Method to to find wind chill
    public static double WindChill(double t, double v, double windChill) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of temprature less than 50");
        t = sc.nextDouble();
        System.out.println("Enter value of wind Speed (larger than 120 or less than 3) ");
        v = sc.nextDouble();

        //This formula is not valid if t is larger than 50 in absolute value or if v is larger
        //than 120 or less than 3 (you may assume that the values you get are in that range).

        if ((t < 50) && ((v > 120) || (v < 3))) {
            windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Given a temperature of " + t + " Fahrenheit" + " and a wind speed of " + v + " mph");
            System.out.println("The wind chill is " + windChill);

        } else {
            System.out.println("Invalid inputs");
        }

        return windChill;
    }

    //Method to  convert Temprature from  Celsius to Fahrenheit and Fahrenheit to Celsius:

    public static String TempratureConversion() {
        double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int choice = sc.nextInt();
        //Using case statement select the condition.By selectin 1 convert temprature from Fahrenheit to Celsie 2.Celsius to Fahrenheit
        switch (choice) {
            case 1:
                System.out.println("Enter  Fahrenheit temperature");
                Scanner sc1 = new Scanner(System.in);
                f = sc1.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius temperature is = " + c);
                break;
            case 2:
                System.out.println("Enter  Celsius temperature");
                Scanner sc2 = new Scanner(System.in);
                c = sc2.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit temperature is = " + f);
                break;
            default:
                System.out.println("please choose valid choice");
        }
        return "";
    }

    //Method for Power of 2 calculation
    public static String power() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.pow(i, 2));
        }
        return "";
    }

    public static void Trig(int degree, double radians, double sinValue, double cosValue) {
        // convert degrees to radians and print the value .

        radians = Math.toRadians(degree);

        //print the value of sin and cos
        sinValue = Math.sin(radians);
        cosValue = Math.cos(radians);

        System.out.println("Degree to Radian  : " + radians);
        System.out.println("sin(" + degree + ") = " + sinValue);
        System.out.println("cos(" + degree + ") = " + cosValue);

    }

    //Method for Stat5 Calculation which prints 5 random numbers and prints the smallest and largest of them
    public static void stat5() {
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();
        System.out.println("Random number 1 : " + random1);
        System.out.println("Random number 2 : " + random2);
        System.out.println("Random number 3 : " + random3);
        System.out.println("Random number 4 : " + random4);
        System.out.println("Random number 4 : " + random5);

        System.out.println("The smallest number from the above random numbers ");
        System.out.println(Math.min(random5, Math.min(random4, Math.min(random3, (Math.min(random1, random2))))));

        System.out.println("The largest number from the above random numbers");
        System.out.println(Math.max(random5, Math.max(random4, Math.max(random3, (Math.max(random1, random2))))));
    }

    //Method for show Gregorian Calender
    public static void dayOfWeek(int month, int day, int year)
    {
        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;
        while (keepGoing) {
            //Select the month as the input
            System.out.println("Enter the month ");
             month = scanner.nextInt();
            if (month == 1) {
                System.out.println("January");
            } else if (month == 2) {
                System.out.println("February");
            } else if (month == 3) {
                System.out.println("March");
            } else if (month == 4) {
                System.out.println("April");
            } else if (month == 5) {
                System.out.println("May");
            } else if (month == 6) {
                System.out.println("June");
            } else if (month == 7) {
                System.out.println("July");
            } else if (month == 8) {
                System.out.println("August");
            } else if (month == 9) {
                System.out.println("September");
            } else if (month == 10) {
                System.out.println("October");
            } else if (month == 11) {
                System.out.println("November");
            } else if (month == 12) {
                System.out.println("December");
            }
            System.out.println("Enter the day ");
             day = scanner.nextInt();
            //Condition day is greater than1 or smaller than 31.

            if (day < 1 || day > 31) {
                System.out.println("Day are between 1 to 31");
                continue;
            }
            System.out.println("Enter year ");
             year = scanner.nextInt();
            if (year < -10000 || year > 10000) {
                System.out.println("Year are between -10000  to 10000 ");
                continue;
            }
            int yeaar0 = year - (14 - month) / 12;

            // both for leap and non leap years
            int x = yeaar0 + yeaar0 / 4 - yeaar0 / 100 + yeaar0 / 400;

            int month0 = month + 12 * ((14 - month) / 12) - 2;

            int day0 = (day + x + 31 * month0 / 12) % 7;

            if (day0 == 0) {
                System.out.println("Sunday ");
            } else if (day0 == 1) {
                System.out.println("Monday ");
            } else if (day0 == 2) {
                System.out.println("Tuesday ");
            } else if (day0 == 3) {
                System.out.println("Wednesday ");
            } else if (day0 == 4) {
                System.out.println("Thursday ");
            } else if (day0 == 5) {
                System.out.println("Friday ");
            } else if (day0 == 6) {
                System.out.println("Saturday ");
            }
        }

    }
}
