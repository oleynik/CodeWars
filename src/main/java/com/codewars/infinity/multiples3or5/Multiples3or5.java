package com.codewars.infinity.multiples3or5;

import java.util.stream.IntStream;

public class Multiples3or5 {

    private Multiples3or5() {}

    public static int solution(int number) {
        return IntStream.range(1, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }
}
