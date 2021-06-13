package com.bridgelabz.boosterjavaprograms.day8;

public class MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {
        int[] inputArr = {5, 6, 7, 15, 10, 24, 9};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for (int i : inputArr) {
            System.out.println(i + "");
        }
    }

    //Passing an Array
    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.length = inputArr.length;//find length of an array.
        this.tempMergeArr = new int[length];//creating an temp array.
        divideArray(0, length - 1);//higherIndex= length-1 and lowerIndex =0
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        //Using recertion method
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            divideArray(lowerIndex, middle);//it will sort the left side of an array
            divideArray(middle + 1, higherIndex);//it will sort right side of an array.

            mergeArray(lowerIndex, middle, higherIndex);
        }

    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        //Putting value of array into tempmergeArray
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;

            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }

    }
}
