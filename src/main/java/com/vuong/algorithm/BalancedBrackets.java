// Java program for checking 
// balanced brackets
package com.vuong.algorithm;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanceBrace(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char top;
            switch (currentChar) {
                case ')':
                    top = stack.pop();
                    if (top == '[' || top == '{') {
                        return false;
                    }
                    break;
                case ']':
                    top = stack.pop();
                    if (top == '(' || top == '{') {
                        return false;
                    }
                    break;
                case '}':
                    top = stack.pop();
                    if (top == '[' || top == '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static boolean balParenthesis(String exp) {
        Stack<Character> stack = new Stack();

        // neu nhu la open brace thi push vao stack
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
                stack.push(exp.charAt(i));
            }

            if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                // neu nhu bat dau chuoi string da la close brace
                if (stack.empty()) {
                    return false;
                }
                Character top = stack.pop();
                //neu sai thu tu
                if ((top == '(' && exp.charAt(i) != ')') || (top == '{' && exp.charAt(i) != '}') || (top == '[' && exp.charAt(i) != ']')) {
                    return false;
                }
            }
        }
        // khi ma chay den het string ma stack duoc pop het ==> balance
        // neu stack ma ko empty co the la do thieu close brack.
        return stack.empty();
    }


}
