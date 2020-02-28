package com.codewars.infinity.missingletter;

import java.util.Arrays;

public class MissingLetter {

    private MissingLetter() {}

    public static char findMissingLetter(char[] array) {
        char[] copy = Arrays.copyOf(array, array.length);
        for (int i=0;i<copy.length-1;i++) {
            char expected = ++copy[i];
            if (expected != copy[i+1]) {
                return expected;
            }
        }
        return 0;
    }
}
