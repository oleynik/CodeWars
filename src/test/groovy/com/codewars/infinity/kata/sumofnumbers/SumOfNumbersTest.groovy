package com.codewars.infinity.kata.sumofnumbers

import spock.lang.Specification

class SumOfNumbersTest extends Specification {

    def "Get sum of between"() {
        expect:
            SumOfNumbers.getSum(a, b) == c
        where:
            a   |   b   ||  c
            1   |   0   ||  1
            1   |   2   ||  3
            0   |   1   ||  1
            1   |   1   ||  1
            -1  |   0   ||  -1
            -1  |   2   ||  2
    }
}
