/*
input:

*/


package com.vuong.algorithm;

public class FibonancciWithRecusion {
    
    public static void fibonacciSeries(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf("%s ", getFibonacci(i));
        }
    }

    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
