/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.algorithm;

/**
 * @author ducvuong25
 */
public class A10_getMaxPrimeLessThanN {



    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getMaxPrimeLessThanN(int n) {
        for (int i = n - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // tra ve -1 neu khong co so nguyen to nao nho hon so do (cac so <2) //convention
    }
    public static int getMaxPrimeLessThanN_redo(int n) {
        for (int i = n - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }


}
