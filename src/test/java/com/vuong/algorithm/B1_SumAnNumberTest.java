package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class B1_SumAnNumberTest {

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param1")
    public void A1_SumAnNumber_Test01(int input, int expected) {
        Assertions.assertEquals(expected, B1_SumAnNumber.getTotal(input));
    }
    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param2")
    public void A1_SumAnNumber_Test02(int input, int expected) {
        Assertions.assertEquals(expected, B1_SumAnNumber.getEvenTotal(input));
    }




}
