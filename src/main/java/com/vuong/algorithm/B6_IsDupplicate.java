package com.vuong.algorithm;


public class B6_IsDupplicate {

    public static boolean checkDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkDuplicate_redo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}