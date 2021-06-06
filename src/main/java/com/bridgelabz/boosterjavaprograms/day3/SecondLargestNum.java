//Code to Find Second Largest value from unsorted array without sorting array.
package com.bridgelabz.boosterjavaprograms.day3;

public class SecondLargestNum {
    public static void main(String[] args) {
            //Declear an array
        int array[] = {10, 20, 25, 63, 96, 57};
        int largest = array[0]; //taking 0th index as an teperay largest and second largest value
        int secondlargest = array[1];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > largest)

            {
                //Replacig the value of largest to second largest
                secondlargest = largest;
                //Assign new largest value to largest
                largest = array[i];
            }
            //Also check the condition for finding Second largest value from array
            else if(array[i] > secondlargest && array[i]!=largest)
            {
                //After above condition get true print second largest value
                secondlargest=array[i];
            }
        }
        System.out.println("2nd largest value   "+secondlargest);
        System.out.println("1st largest value   "+largest);
    }
}
