package com.bridgelabz.boosterjavaprograms.Array;

public class reverseArray {
    public static void main(String[] args) {
int[] array={1,2,3,4,5,6,7,8,9};
int size = array.length;
        for(int i =0;i<size;i++){
            System.out.print(array[i]+" ");
        }
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
        for(int i =0;i<size;i++){
            System.out.print(array[i]+" ");
        }

    }
}
