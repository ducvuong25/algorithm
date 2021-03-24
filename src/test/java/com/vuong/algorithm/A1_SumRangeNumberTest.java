package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class A1_SumRangeNumberTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param8")
    void getTotal(int input, int expected) {
        int actual = A1_SumRangeNumber.getTotal(input);
        Assertions.assertEquals(expected,actual );
    }

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param8")
    void getTotal2(int input, int expected) {
        int actual = A1_SumRangeNumber.getTotal2(input);
        Assertions.assertEquals(expected,actual );
    }
}