package com.vuong.algorithm;

/*
input: int n (vi du 5)
ouput: in ra cac so nguyen trong khoang 1 toi n (2 3 5 ); include n if n is prime Number too;
 chu y:
so nguyen to la so chi chet het cho 1 va chinh no
0 va 1 khong phai so nguyen to
moi so chan deu khong phai la so nguyen tu tru so 2

 */
public class A7_PrimelSeriesWithoutRecusion {


    static void printSeriesPrime(int N) {
        int i, j, flag;
        for (i = 1; i <= N; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
