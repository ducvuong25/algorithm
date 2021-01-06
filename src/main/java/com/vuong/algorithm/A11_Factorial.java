package com.vuong.algorithm;

public class A11_Factorial {




    public static int getFactorialWithfor(int n) {
        int f = n;
        for (int i = n - 1; i > 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static int getFactorialWithRecusive(int n) {
        //phan conditon thoat de quy
        if (n == 0) {
            return 1;
        }
        //phan goi de quy
        return n * getFactorialWithRecusive(n - 1);
    }

}
