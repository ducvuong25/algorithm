package com.vuong.algorithm.factoryparam;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FactoryParam {
    public static Stream<Arguments> param1() {
        return Stream.of(
                Arguments.of(1245, 12),
                Arguments.of(12345, 15),
                Arguments.of(12322, 10)
        );

    }

    public static Stream<Arguments> param2() {
        return Stream.of(
                Arguments.of(1245, 6),
                Arguments.of(123456, 12),
                Arguments.of(12322, 6)
        );

    }

    public static Stream<Arguments> param3() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 5, 6, 3, 6}, new int[]{2, 3, 4, 5, 6, 6}),
                Arguments.of(new int[]{3, 5, 1, 6, 8}, new int[]{1, 3, 5, 6, 8}),
                Arguments.of(new int[]{7, 4, 2, 7, 2, 4, 8, 2}, new int[]{2, 2, 2, 4, 4, 7, 7, 8})
        );
    }

    public static Stream<Arguments> param4() {
        return Stream.of(
                Arguments.of(7, 2, 56),
                Arguments.of(9, 7, 315)
        );

    }

    /*
        param dung de test balance brace
    */
    public static Stream<Arguments> param5() {
        return Stream.of(
                Arguments.of("(){}[]({([])})", true),
                Arguments.of("{{{}}}[](())", true),
                Arguments.of("({)}", false),
                Arguments.of("({}", false),
                Arguments.of("[])", false),
                Arguments.of("(())]", false),
                Arguments.of("{{{}}}[]({)}", false),
                Arguments.of("{{{}}}[])({}", false),
                Arguments.of("{{{}}}[])({}abc", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la ((053) - 110 - 238", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la (053)) - 110 - 238", false),
                Arguments.of("cam on anh(chi) da den, ma so cua toi la (053) - 110 - 238()", true)
        );

    }

    /*
        param dung de test dupplicate array
    */
    public static Stream<Arguments> param6() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, true),
                Arguments.of(new int[]{6, 3, 2, 4, 8}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 2, 5, 6}, false),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 3, 3}, false)
        );


    }

    /*param dung de test revertArray*/
    public static Stream<Arguments> param7() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, new int[]{6, 5, 4, 3, 2, 1}),
                Arguments.of(new int[]{6, 3, 2, 4, 8}, new int[]{8, 4, 2, 3, 6}),
                Arguments.of(new int[]{1, 2, 3, 4, 2, 5, 6}, new int[]{6, 5, 2, 4, 3, 2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 3, 3}, new int[]{3, 3, 5, 4, 3, 2, 1})
        );
    }

    /*param dung de test SumRangeNumber*/
    public static Stream<Arguments> param8() {
        return Stream.of(
                Arguments.of(5, 15),
                Arguments.of(15, 120),
                Arguments.of(50, 1275),
                Arguments.of(100, 5050),
                Arguments.of(10000, 50005000)
        );
    }
}