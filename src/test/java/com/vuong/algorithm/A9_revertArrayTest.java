package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class A9_revertArrayTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param7")
    void revertArrayTest(int[] intput, int[] expected) {
        int[] actual = A9_revertArray.revertArray_redo(intput);
        Assertions.assertArrayEquals(expected, actual);

    }
}