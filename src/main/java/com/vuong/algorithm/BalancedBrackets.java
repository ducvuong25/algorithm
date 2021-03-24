// Java program for checking 
// balanced brackets
package com.vuong.algorithm;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanceBrace2(String string) {
        // khoi tao 1 stack<Character> trong
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                charStack.push(currentChar);
                continue;
            }
            if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // neu bat dau spring la open barace, hoac la thua close brace
                if (charStack.empty()) {
                    return false;
                }
                Character top = charStack.pop();
                // neu close brace sai vi tri
                if (
                                (top == '(' && currentChar != ')') ||
                                (top == '{' && currentChar != '}') ||
                                (top == '[' && currentChar != ']')) {
                    return false;
                }
            }
        }
        // khi ma chay den het string ma stack duoc pop het ==> balance
        // neu stack ma ko empty la thieu close brace
        return charStack.empty();

    }


}
