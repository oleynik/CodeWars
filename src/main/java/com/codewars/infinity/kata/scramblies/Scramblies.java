package com.codewars.infinity.kata.scramblies;

import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {

    private Scramblies() {}

    public static boolean scramble(String str1, String str2) {
        List<Character> abc = str1.chars().mapToObj(code -> (char) code).collect(Collectors.toList());
        for (char ch : str2.toCharArray()) {
            if (!abc.remove(Character.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
