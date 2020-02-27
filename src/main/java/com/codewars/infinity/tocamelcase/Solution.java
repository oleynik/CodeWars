package com.codewars.infinity.tocamelcase;

import java.util.stream.Stream;

public class Solution {

    private Solution() {}

    public static String toCamelCase(String s) {
        String[] split = s.split("[-_]");
        Stream<String> stringStream = Stream.of(split)
                .skip(1)
                .map(val -> Character.toUpperCase(val.charAt(0)) + val.substring(1));
        return Stream.concat(Stream.of(split[0]), stringStream)
                .reduce(String::concat)
                .orElseThrow(IllegalStateException::new);
    }
}
