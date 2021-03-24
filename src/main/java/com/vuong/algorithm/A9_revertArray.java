package com.vuong.algorithm;

public class A9_revertArray {


    public static int[] revertArray(int[] arr) {
        for (int i = 1; i <= arr.length / 2; i++) {
            int temp = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i]= temp;
        }
        return arr;
    }

    public static int[] revertArray_redo(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;

    }

}
