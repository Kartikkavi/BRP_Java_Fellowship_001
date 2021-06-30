package com.bridgelabz.boosterjavaprograms.exta;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
    public static void main(String args[]) {
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10, 21, 32};

        int size = array.length;
        System.out.println("size of array before = " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("value at 2nd index befor =  " + array[2]);
        System.out.println();

        int loc = 2;
        for (int i = loc; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        System.out.println(" size of array after= " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("value at 2nd index after  " + array[2]);
        System.out.println("Reverse array");
        int start =0;
        int end =size-1;
        while (start<end){
            int temp =array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}

