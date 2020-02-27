package com.codewars.infinity.spinwords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {

    private SpinWords() {}

    public static String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(value -> (value.length()>=5 ? new StringBuilder(value).reverse().toString():value))
                .collect(Collectors.joining(" "));
    }
}
