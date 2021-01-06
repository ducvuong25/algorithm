package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class A3_BubbleSortTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param3")
    public void sortASCTest(int[] input, int[] expected) {
        A3_BubbleSort.sortASC(input);
        Assertions.assertArrayEquals(expected, input);
    }
}
