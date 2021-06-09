//Program to find Maximum and Minimum value from Integer Array.
package com.bridgelabz.boosterjavaprograms.day5;

public class MaxMinIntArray {
    public static void main(String[] args) {

        int array[] = {10, 20, 25, 63, 96, 57};
        int smalest =array[0];
        int secondsmalest = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <smalest)

            {
                secondsmalest = smalest;
                smalest = array[i];
            }
            else if(array[i] < secondsmalest && array[i]!=smalest)
            {
                secondsmalest=array[i];
            }
        }
        System.out.println("2nd smallest value"+secondsmalest);
        System.out.println("1st smallest value"+smalest);

//
//        int array[] = {10, 20, 25, 63, 96, 57};
//        int largest =array[0];
//        int secondlargest = array[1];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > largest)
//
//            {
//                secondlargest = largest;
//                largest = array[i];
//            }
//            else if(array[i] > secondlargest && array[i]!=largest)
//            {
//                secondlargest=array[i];
//            }
//        }
//        System.out.println("2nd largest value"+secondlargest);
//        System.out.println("1st largest value"+largest);

    }
}
