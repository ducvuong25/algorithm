package com.vuong.algorithm;

public class A1_SumRangeNumber {
    public static int getTotal(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
    public static int getTotal2(int n) {
        return n * (n + 1) / 2;
    }

}
