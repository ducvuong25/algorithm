package com.vuong.algorithm.factoryparam;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FactoryParam {
    public static Stream<Arguments> param1(){
        return Stream.of(
                Arguments.of(1245, 12),
                Arguments.of(12345, 15),
                Arguments.of(12322, 10)
        );

    }
    public static Stream<Arguments> param2(){
        return Stream.of(
                Arguments.of(1245, 6),
                Arguments.of(123456, 12),
                Arguments.of(12322, 6)
        );

    }
    public static Stream<Arguments> param3(){
        return Stream.of(
                Arguments.of(new int[]{2,4,5,6,3,6}, new int[] {2,3,4,5,6,6})
        );

    }
    public static Stream<Arguments> param4(){
        return Stream.of(
                Arguments.of(7,2,56),
                Arguments.of(9,7,315)
        );

    }
    /*
        param dung de test balance brace
    */
    public static Stream<Arguments> param5(){
        return Stream.of(
                Arguments.of("(){}[]({([])})", true),
                Arguments.of("{{{}}}[](())", true),
                Arguments.of("{{{}}}[]({)}", false),
                Arguments.of("{{{}}}[])({}", false),
                Arguments.of("{{{}}}[])({}abc", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la ((053) - 110 - 238", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la (053)) - 110 - 238", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la (053) - 110 - 238()", true)
        );

    }
}
