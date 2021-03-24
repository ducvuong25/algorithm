package com.vuong.algorithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedBracketsTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param5")
    void isBalanceBrace(String StringInput, boolean expected) {
        assertEquals(expected, BalancedBrackets.isBalanceBrace(StringInput));
    }

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param5")
    void balParenthesis(String StringInput, boolean expected) {
        assertEquals(expected, BalancedBrackets.balParenthesis(StringInput));

    }
}