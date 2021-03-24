package com.vuong.algorithm;
//input array {1,2,3,4,5}
//output int 15;



public class A1_SumAnArray {



    public static int getTotal(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total = total + num;
        }
        return total;

    }

    public static int getEvenTotal(int[] arr) {
        int total = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                total = total + num;
            }
        }
        return total;

    }
}
