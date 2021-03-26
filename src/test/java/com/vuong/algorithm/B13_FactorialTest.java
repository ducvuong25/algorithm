package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class B13_FactorialTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param10")
    void getFactorialWithfor(int input, int expected) {
        int actual = B13_Factorial.getFactorialWithfor(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param10")
    void getFactorialWithRecusive(int input, int expected) {
        int actual = B13_Factorial.getFactorialWithRecusive(input);
        Assertions.assertEquals(expected,actual);
    }



}