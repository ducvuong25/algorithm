package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class B14calculateFineTest {
    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param4")
    public void tinhPhatWithFor_Test(int solanPhat , int mucPhat , int expected){
        Assertions.assertEquals(expected, B14_calculateFine.tinhPhatWithFor(solanPhat, mucPhat));
    }

    @ParameterizedTest
    @MethodSource("com.vuong.algorithm.factoryparam.FactoryParam#param4")
    public void tinhPhatWithRecusive_Test(int solanPhat , int mucPhat , int expected){
        Assertions.assertEquals(expected, B14_calculateFine.tinhPhatWithRecusive(solanPhat, mucPhat));
    }
}
