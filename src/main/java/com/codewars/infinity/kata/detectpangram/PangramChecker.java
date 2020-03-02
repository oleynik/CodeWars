package com.codewars.infinity.kata.detectpangram;

import java.util.List;
import java.util.stream.Collectors;

public class PangramChecker {

    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";

    private PangramChecker() {}

    public static boolean check(String sentence) {
        List<Character> abcCopy = ABC.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (!ABC.contains(String.valueOf(ch))) {
                continue; // spaces, punctuations and other stuff
            }
            abcCopy.remove(Character.valueOf(ch));
        }
        return abcCopy.isEmpty();
    }
}
