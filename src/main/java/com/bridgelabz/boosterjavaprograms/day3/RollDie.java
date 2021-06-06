package com.bridgelabz.boosterjavaprograms.day3;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        Random rd = new Random(); // random number generator
        int freq[] = new int[6]; // creating an array to compute frequency of each face
        int val;
        int chance = 1;
        // rolling the dice 6000 times
        while(chance <= 6000){
            val = 1 + rd.nextInt(6); // generates integers from 1 to 6
            switch (val) {
                case 1:
                    ++freq[0];
                    break;
                case 2:
                    ++freq[1];
                    break;
                case 3:
                    ++freq[2];
                    break;
                case 4:
                    ++freq[3];
                    break;
                case 5:
                    ++freq[4];
                    break;
                case 6:
                    ++freq[5];
                    break;
            }
            chance++;
        }
        for(int i = 1; i <= 6; i++){
            System.out.println("Side: " + i + "-> Frequency : " + freq[i - 1]);
        }
    }
}