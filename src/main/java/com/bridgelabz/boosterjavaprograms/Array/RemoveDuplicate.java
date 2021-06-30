package com.bridgelabz.boosterjavaprograms.Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 4, 5, 3, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int size = array.length;
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i]!=array[i+1]){
                array[j++] =array[i];
            }
        }
        array[j++]=array[size-1];
        for(int k=0;k<j;k++){
            System.out.print(array[k]+" ");
        }

    }
}

