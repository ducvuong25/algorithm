package com.vuong.algorithm;

public class A12_tinhTienPhatHieu {

    public static int tinhPhatWithFor(int soLanPhat, int mucPhat) {
        int total = 0;
        for (int i = 0; i < soLanPhat; i++) {
            total = total + mucPhat * (i + 1);
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
