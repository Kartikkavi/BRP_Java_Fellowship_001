package com.bridgelabz.boosterjavaprograms.Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //Sort Array
        int[] arr = {10, 2, 1, 32, 7, 4, 61, 12, 14, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        System.out.println("Size of array " + size);
        //Sum of all element in array.

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements in array is " + sum);

        //Avg value of element in array
        double Avg = sum / size;
        System.out.println("Avg of Array " + Avg);

        //Check the element is in array or not

        int item = 62;
        for (int i = 0; i < size; i++) {
            if (item == arr[i]) {
                System.out.println("yes element is present in array");
            }
        }

        //find index of an element
        int index = -1;   //After increment it will becom zero 0.
        int element = 32;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        //remove the element
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(" size of array before= " + size);
        System.out.println("Element at index 2 === "+arr[2]);

        int loc = 2;
        for (int i = loc; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println(" size of array after= " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("value at 2nd index after  " + arr[2]);


    }
}