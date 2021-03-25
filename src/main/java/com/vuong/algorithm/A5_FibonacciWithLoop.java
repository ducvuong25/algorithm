package com.vuong.algorithm;

/*
ko su dung de quy
input: int  vi du 10;
output: liet ke day n so fibonacci dau tien (0 1 1 2 3 5 8 13 21 34)
 */
public class A5_FibonacciWithLoop {

    public static void getFibonacci_swith(int n) {
        int first = 0;
        int second = 1;

        switch (n) {
            case 1:
                System.out.println(first);
                break;
            case 2:
                System.out.println(first + " " + second);
                break;
            default:
                System.out.print(first + " " + second);
                for (int i = 2; i < n; i++) {
                    int fib = first + second;
                    System.out.print(" " + fib);
                    first = second;
                    second = fib;
                }
                break;
        }

    }
    public static void getFibonacci_ifElse(int n) {
        int first =  0; int second = 1;
        if (n == 1) System.out.println(first);
        else if (n == 2) System.out.println(first + " " + second);
        else {
            System.out.print(first + " " + second + " ");
            int fib;
            for (int i = 3; i <= n; i++) {
              fib = first + second;
                System.out.print(fib + " ");
                first = second;
                second = fib;
            }
        }

    }
}
