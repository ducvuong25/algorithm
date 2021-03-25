package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class A4_1_CheckDupplicateTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param6")
    void checkDupplicate(int[] input, boolean expected) {
        boolean actual = A4_1_CheckDupplicate.checkDuplicate_redo(input);
        Assertions.assertEquals(expected, actual);
    }
}