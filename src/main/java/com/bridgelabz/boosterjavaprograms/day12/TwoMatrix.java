package com.bridgelabz.boosterjavaprograms.day12;

public class TwoMatrix {
    public static void run() {
        int[][] m = new int[][]{
                {3, 8}, {4, 6}
        };
        System.out.println("Matrix : ");
        for (int[] array : m) {
            for (int i : array)
                System.out.print(i + " ");
            System.out.println();
        }
        System.out.println();
        int det =
                m[0][0] * m[1][1] - m[0][1] * m[1][0];
        System.out.println("Determinant of Matrix is : " + det);
    }

    public static void main(String[] args) {
        TwoMatrix.run();
    }
}
