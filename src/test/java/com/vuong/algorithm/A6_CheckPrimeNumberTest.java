package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class A6_CheckPrimeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2,5,7,11})
    public void isPrime_Test01(int input) {
        Assertions.assertTrue(A6_CheckPrimeNumber.isPrime(input));
    }
    @ParameterizedTest
    @ValueSource(ints = {-3,1,4,9})
    public void isPrime_Test02(int input) {
        Assertions.assertFalse(A6_CheckPrimeNumber.isPrime(input));
    }
}
