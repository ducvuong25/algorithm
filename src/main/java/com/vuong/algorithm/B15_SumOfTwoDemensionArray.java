package com.vuong.algorithm;

public class B15_SumOfTwoDemensionArray {
    public static void main(String[] args) {
        int arr[][] = {{10, 4, 8, 2}, {5, 6, 4, 9}, {20, 3, 8, 1}};
        System.out.println(getTotal(arr));
    }

    public static int getTotal(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 5 == 0) {
                    total = total + arr[i][j];
                }
            }
        }
        return total;
    }
}
