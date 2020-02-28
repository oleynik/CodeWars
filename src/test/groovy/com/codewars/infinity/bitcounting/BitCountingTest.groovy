package com.codewars.infinity.bitcounting

import spock.lang.Specification

class BitCountingTest extends Specification {

    def "BitCount" () {
        expect:
            BitCounting.countBits(n) == r
        where:
            n    || r
            1234 || 5
            4    || 1
            7    || 3
            9    || 2
            10   || 2
    }
}
