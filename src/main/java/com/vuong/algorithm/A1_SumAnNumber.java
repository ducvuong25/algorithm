package com.vuong.algorithm;


public class A1_SumAnNumber {
    // input: int   (8676474)
    // output: int; (42)
    public static int getTotal(int number) {
        int total = 0;
        while (number > 0) {
            total = total + number % 10;
            number = number / 10;
        }
        return total;
    }

    public static int getEvenTotal(int num) {
        int total = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                total = total + num % 10;

            }
            num = num / 10;
        }
        return total;
    }
}
