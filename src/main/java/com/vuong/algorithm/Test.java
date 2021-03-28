package com.vuong.algorithm;

import java.util.StringTokenizer;

public class Test {
public static void main(String[] args) {
    StringTokenizer t = new StringTokenizer("xin chao toi la vuong", " ");
    while (t.hasMoreTokens())
        System.out.println(t.nextToken());
}
}
