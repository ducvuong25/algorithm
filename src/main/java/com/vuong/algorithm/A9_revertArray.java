package com.vuong.algorithm;

public class A9_revertArray {


    public static void revertArray(int[] arr) {
        for (int i = 1; i <= arr.length / 2; i++) {
            int temp = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i]= temp;
        }
    }
}
