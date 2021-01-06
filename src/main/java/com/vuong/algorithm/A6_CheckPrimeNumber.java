package com.vuong.algorithm;

/*

input: 97
ouput: true;

 */
public class A6_CheckPrimeNumber {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } // co them dung else o day
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
