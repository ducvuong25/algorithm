/*
input:

*/


package com.vuong.algorithm;

public class A5_FibonancciWithRecusion {

    public static void fibonacciSeries(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf("%s ", getFibonacci(i));
        }
    }
    // tim ra so fibonanci thu n (chinh la bang tong của 2 so finbonacy lien ke phia sau)
    // hinh thanh khai niem de quy
    public static int getFibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
