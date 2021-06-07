package com.bridgelabz.boosterjavaprograms.day3;



public class SumEven {
    public static void main(String[] args)
    {
            //Declearing an Array
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8};//{1, 2, 5, 8, 9, 7, 6, 4, 7, 12, 14,5,75,97,31,65,5,21,78,100};
        int size = arr.length;//Length of an array
        int even = 0;
        int reverse = 0;
        int x = 0;
        int[] arr1 = new int[size];//Declearing an another array to store the reverse array
        System.out.println("The orignal Array");
        for (int i = 0; i < size; i++)

        {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Arrays.toString(arr)); //Print the Array


        System.out.println();
        System.out.println("Reverse Array");
        for (int j = size - 1; j >= 0; j--)
        {
            // System.out.print(arr[j] + " ");
            arr1[x] = arr[j];
            System.out.print(arr1[x] + " ");
            x = x + 1;
        }
        System.out.println();
        System.out.println("Sum of element from Array Present on even position");
        for (x = 0; x < size; x += 2)
        {
            //Method to check the even index value
            if (x % 2 == 0) {
                even = even + arr1[x];
            }
        }
        System.out.println("Sum of even index element= ===========" + even);
        //When the loop exits,reversed will contain the reversed number
        while (even != 0)
        {
            //Reversing the Number.
            int remainder = even % 10;
            reverse = reverse * 10 + remainder;
            even = even / 10;
        }
        System.out.println("Reversethe Num ============= " + reverse);
    }
}