package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class B3B_4_QuickSort_BubbleshortTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param3")
    public void bubbleSortTest(int[] input, int[] expected) {
        B3_B4_QuickSort_Bubbleshort.bubbleSort2(input);
        Assertions.assertArrayEquals(expected, input);
    }


}
