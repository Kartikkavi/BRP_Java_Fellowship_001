package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Arrays;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9};
        int size = Array.length;
        for (int i=0;i<size;i++) {
            System.out.print(Array[i]+" ");
        }
        System.out.println();
        System.out.println("******************************************");

        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Array[i] % 2 == 0) {
                    temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
            System.out.print(Array[i]+" ");

        }
        Arrays.sort(Array,0,Array.length);
        System.out.println(Arrays.toString(Array));

    }
}