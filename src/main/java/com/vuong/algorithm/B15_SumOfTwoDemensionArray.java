package com.vuong.algorithm;

public class B15_SumOfTwoDemensionArray {
    public static void main(String[] args) {
        int arr[][] = {{5, 7, 3}, {1, 2, 4}};
        System.out.println(getTotal(arr));
    }

    public static int getTotal(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
            }
        }
        return total;
    }
}
