/*
input: String "({[]})"
output: boolean  true neu balance (LIFO), false neu unbalance
 */
package com.vuong.algorithm;

public class A8_BalancedBraceWithouStack {


    public static boolean isValid(String str) {
        int lengthOfStr = str.length();
        for (int i = 0; i < lengthOfStr; i++) {
            str = str.replace("[]", "").replace("()", "").replace("{}", "");
        }
        return str.isEmpty();
    }
}
