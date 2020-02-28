package com.codewars.infinity.kata.sumofnumbers;

import java.util.stream.IntStream;

public class SumOfNumbers {

    private SumOfNumbers() {}

    public static int getSum(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return IntStream.rangeClosed(min, max).sum();
    }
}
