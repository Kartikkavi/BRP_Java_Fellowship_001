package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Arrays;

public class AddOddElements {
    public static void main(String[] args) {
        int a=0;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        //TO get element at odd position
        for (int i =0;i <arr.length;i=i+2){
            a = arr[i]+a;
            System.out.println(arr[i]);
        }
        System.out.println(a);
    }
    //Reversed the a


}
