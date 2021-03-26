package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class B11_getMaxPrimeLessThanNTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param9")
    void getMaxPrimeLessThanN_redo(int input, int expected) {
        int actual = B11_getMaxPrimeLessThanN.getMaxPrimeLessThanN_redo(input);
        Assertions.assertEquals(expected,  actual);
    }
}