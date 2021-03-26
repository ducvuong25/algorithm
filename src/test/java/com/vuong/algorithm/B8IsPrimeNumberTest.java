package com.vuong.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class B8IsPrimeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
    public void isPrime_Test01(int input) {
        Assertions.assertTrue(B8_IsPrimeNumber.isPrime(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {-3, 1, 4, 9})
    public void isPrime_Test02(int input) {
        Assertions.assertFalse(B8_IsPrimeNumber.isPrime(input));

    }
}
