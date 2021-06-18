package com.bridgelabz.boosterjavaprograms.day9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBook
{

    static String fName;
    static String lName;
    static String email;
    static String  pNum;
    static String pass;
    static String cName;


    public static String firstName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your first name first letter must be Capital");
        fName = sc1.nextLine();
        return fName;
    }
    public static String lastName(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your last name first letter must me Capital:");
        lName = sc2.nextLine();
        return lName;
    }


    public static String emailId(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your Email id:");
        email = sc3.nextLine();
        return email;
    }
    public static String Pasword(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter your pasword :");
        pass= sc4.nextLine();
        return pass;
    }
    public static String phoneNum(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter your Mobile number:");
        pNum = sc5.nextLine();
        return pNum;
    }
    public static String componyName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your first name first letter must be Capital");
        int choice = 0;
        switch (choice){
            case 1: cName = sc1.nextLine();
                break;
            default:
                System.out.println("Dont want to fill");
        }

        return cName;
    }
    public static void main(String[] args) {
        Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",AddressBook.firstName());

        Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",AddressBook.lastName());

        Boolean emailId = Pattern.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}",AddressBook.emailId());

        Boolean Pasword = Pattern.matches("^(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}",AddressBook.Pasword());

        Boolean phoneNum = Pattern.matches("^\\d{10}$",AddressBook.phoneNum());

        Boolean componyName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",AddressBook.componyName());

        if (firstName == true) {
            System.out.println("First Name: " + fName);

        }
        else {
            System.out.println("Invalid");}

        if (lastName == true) {
            System.out.println("Last Name: " + lName);
        }
        else {
            System.out.println("invalid");}

        if (emailId == true) { System.out.println("Email id: " + email);
        }
        else {System.out.println("INvalid");}

        if (Pasword == true) {
            System.out.println("Security Password: " + pass);
        }
        else {System.out.println("INvalid");}

        if (phoneNum == true) {
            System.out.println("Mobile number: " + pNum);

        }
        else {
            System.out.println("Invalid");}
        if (componyName == true) {
            System.out.println("ComponyName: " + cName);

        }
        else {
            System.out.println("Invalid");}
    }
}

