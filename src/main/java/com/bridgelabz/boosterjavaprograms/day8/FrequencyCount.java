package com.bridgelabz.boosterjavaprograms.day8;

import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        //Converting into char array
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (j < i&&(ch[j] == ch[i])) {
                    break;
                }
                if (ch[i] == ch[j]) {

                    count++;
                }
            }
            if (count>0){
                System.out.println(ch[i] +" is "+count+" time ");
            }
        }
    }
}