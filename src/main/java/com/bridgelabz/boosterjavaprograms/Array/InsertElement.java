package com.bridgelabz.boosterjavaprograms.Array;

public class InsertElement {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9};
        int size =array.length;
        int loc =3;
        int value =30;
        for (int i =0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i =size-1;i>loc;i--){
            array[i]=array[i-1];
        }
        array[loc]=value;
        for (int i =0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
