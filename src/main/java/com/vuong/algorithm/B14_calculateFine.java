package com.vuong.algorithm;

public class B14_calculateFine {

    public static int tinhPhatWithFor(int soLanPhat, int mucPhat) {
        int total = 0;
        for (int i = 1; i <= soLanPhat; i++) {
            total = total + mucPhat * i;
        }
        return total;
    }
    public static int tinhPhatWithRecusive(int soLanPhat, int mucPhat){
        if (soLanPhat == 1) {
            return mucPhat;
        }
        return mucPhat * soLanPhat + tinhPhatWithRecusive(soLanPhat - 1, mucPhat);
    }
}
