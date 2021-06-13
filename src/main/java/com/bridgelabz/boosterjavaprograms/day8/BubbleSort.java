// Program for Bubble sort array
package com.bridgelabz.boosterjavaprograms.day8;

public class BubbleSort {
    public static void main(String[] args) {
        //Declearing and array
        int array[] ={6, 4, 1, 2, 5};
        //Compare each elements with next element
        //After each iteration higher element reach at end of and array
        //and we get sort array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                //by using swaping replace the elements
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
