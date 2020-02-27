package com.codewars.infinity.multiples3or5

import spock.lang.Specification

class Multiples3or5Test extends Specification {
    def "Sum Multiples of 3 or 5 below 10"() {
        expect:
            Multiples3or5.solution(10) == 23
    }
}
