package com.bridgelabz.boosterjavaprograms.Array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,3,1,4};
        for (int i =0;i<array.length-1;i++){
            for (int j =i+1;j <array.length;j++){
                if (array[i]==array[j]){
                    System.out.println("Duplicat values "+array[j]);
                }
            }
        }
    }
}
