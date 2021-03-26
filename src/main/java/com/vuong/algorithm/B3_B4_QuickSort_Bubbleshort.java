/*
input [8,3,9,2,7]
ouputASC [2,3,7,8,9];
ouput [9,8,7,3,2]
 */
package com.vuong.algorithm;

public class B3_B4_QuickSort_Bubbleshort {


    // day khong phai la thuat toan sap xep noi bot
    // vi no di so sanh 1 phan tu vs lan luot cac phan tu ben trai
    public static void quickSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    // day moi thuc su la phep tinh noi bot vi do so sanh 2 phan tu lien ke
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    //bubble sort on tap

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1 ] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}
