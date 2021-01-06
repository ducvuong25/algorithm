/*
input: array {1,2,3,1,4,5,3,4};
output: in ra danh sach 2,5

Ý tưởng: Một phần tử bị trùng khi mà xuất hiện ít nhất 1 giá trị thứ 2 trùng (giá trị giống nhau
Nhưng index khác nhau)
 */
package com.vuong.algorithm;



public class A4_findUniqueDigit {


    public static void getUniqueNumbers(int[] arr) {
        boolean unique;
        for (int i = 0; i < arr.length; i++) {
            unique = true;
            for (int j = 0; j < arr.length; j++) {
                // neu trung
                if (arr[i] == arr[j] && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
