package com.vuong.algorithm;

/*
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
la nhung so nguyen to
 */
public class A7_PrimelSeriesWithoutRecusionB {


    public static void printNFirstPrime(int number) {
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

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
