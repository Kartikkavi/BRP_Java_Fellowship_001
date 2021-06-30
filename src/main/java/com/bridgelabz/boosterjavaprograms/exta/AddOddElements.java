package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Arrays;

public class AddOddElements {
    public static void main(String[] args) {
      int  reverse=0;
        int a = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));

        //TO get element at odd position
        for (int i = 0; i < arr.length;i ++) {
            if (arr[i]%2!=0) {
                a = arr[i] + a;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(a);

        //Reversed the a
        while (a != 0) {
            //Reversing the Number.
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
        }
        System.out.println("Reversethe Num ============= " + reverse);


    }
}
