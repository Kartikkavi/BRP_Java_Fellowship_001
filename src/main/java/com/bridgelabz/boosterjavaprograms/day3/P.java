package com.bridgelabz.boosterjavaprograms.day3;

public class P
{
    public static void main(String[] args)
    {
        int sum =0;
       int a =0;
       int p =0;
        int[] arr = new int[]{2, 3, 5, 6, 7, 8};//{1, 2, 5, 8, 9, 7, 6, 4, 7, 12, 14,5,75,97,31,65,5,21,78,100};
        int size = arr.length;//Length of an array

        for (int i=0;i<size;i++){
a=2;
p=1;
            while(a<arr[i]){
                if(arr[i]%a==0){
                    p=0;
                    break;
                }
                a++;
            }
            if(p==1){
                 sum=sum+arr[i];
            }
        }

        System.out.println("Sum of prime=========="+sum);
    }
}
