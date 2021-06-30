package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Arrays;

public class SegregateoddEven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int size=arr.length;
        System.out.println("Size of an Array "+size);
        int odd=0;
        int left=0;
        int right =arr.length-1;
        int temp =0;
        while(left<right)
        {
            while(arr[left] %2!=0)
            {
                odd++;
                left++;
            }
            while(arr[right]%2==0)
            {
                right--;
            }
            if(left<right)
            {
                temp = arr[left];
                arr[left]= arr[right];
                arr[right]=temp;
            }
        }
        Arrays.sort(arr,0 ,odd);
        Arrays.sort(arr,odd,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
