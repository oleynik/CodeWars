package com.codewars.infinity.kata.detectpangram

import spock.lang.Specification
import spock.lang.Unroll

class PangramCheckerTest extends Specification {

    @Unroll
    def "Pangram checked for #sentence returned #result"() {
        expect:
            PangramChecker.check(sentence) == result
        where:
        result  ||  sentence
        true    ||  "The quick brown fox jumps over the lazy dog."
        false   ||  "You shall not pass!"
    }
}
