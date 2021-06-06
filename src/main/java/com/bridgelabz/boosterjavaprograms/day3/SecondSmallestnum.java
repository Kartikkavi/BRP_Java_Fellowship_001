//Code to Find Second smallest value from unsorted array without sorting array.

package com.bridgelabz.boosterjavaprograms.day3;

public class SecondSmallestnum {

    public static void main(String[] args) {
        //Declear an array
        int array[] = {10, 20, 25, 63, 96, 57};
        int smallest = array[0]; //taking 0th index as an teperay smallest and second smallest value
        int secondsmallest = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                //Replacig the value of smallest to second smallest
                secondsmallest = smallest;
                //Assign new smallest value to smallest
                smallest = array[i];
            }
            //Also check the condition for finding Second largest value from array
            else if (array[i] < secondsmallest && array[i] != smallest) {
                //After above condition get true print second smallest value
                secondsmallest = array[i];
            }
        }
        System.out.println("2nd secondsmallest value   " + secondsmallest);
        System.out.println("1st smallest value   " + smallest);
    }
}


