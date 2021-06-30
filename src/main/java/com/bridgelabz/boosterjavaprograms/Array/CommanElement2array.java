package com.bridgelabz.boosterjavaprograms.Array;

public class CommanElement2array {
    public static void main(String[] args) {
        int[] A={12,13,14,1,5,16,17,18};
        int[] B ={1,2,3,11,17,18};
        for (int i =0;i<A.length;i++){
            for (int j =0;j<B.length;j++){
                if (A[i]==B[j]){
                    System.out.println("Comman elemnt are "+A[i]);
                }
            }
        }
    }
}
