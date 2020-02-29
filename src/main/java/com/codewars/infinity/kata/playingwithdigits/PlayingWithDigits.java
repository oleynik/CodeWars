package com.codewars.infinity.kata.playingwithdigits;

public class PlayingWithDigits {

    private PlayingWithDigits() {
    }

    public static long digPow(int n, int p) {
        double sum = 0;
        for (char ch : String.valueOf(n).toCharArray()) {
            sum += Math.pow(Integer.valueOf(String.valueOf(ch)), p++);
        }
        double k = sum / n;
        return (k - ((long) k)) == 0 ? (long) k : -1;
    }
}
