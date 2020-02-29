package com.codewars.infinity.kata.playingwithdigits

import spock.lang.Specification
import spock.lang.Unroll

class PlayingWithDigitsTest extends Specification {

    @Unroll
    def "digPow(#n, #p) should return #k"() {
        expect:
            PlayingWithDigits.digPow(n, p) == k
        where:
            n       |   p   ||  k
            89      |   1   ||  1
            92      |   1   ||  -1
            695     |   2   ||  2
            46288   |   3   ||  51
    }
}
