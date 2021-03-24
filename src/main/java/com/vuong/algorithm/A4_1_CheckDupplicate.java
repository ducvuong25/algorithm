package com.vuong.algorithm;


public class A4_1_CheckDupplicate {

    public static boolean checkDupplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }
}