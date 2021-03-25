package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class A11_FactorialTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param10")
    void getFactorialWithfor(int input, int expected) {
        int actual = A11_Factorial.getFactorialWithfor(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param10")
    void getFactorialWithRecusive(int input, int expected) {
        int actual = A11_Factorial.getFactorialWithRecusive(input);
        Assertions.assertEquals(expected,actual);
    }



}