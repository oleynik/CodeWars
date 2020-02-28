package com.codewars.infinity.kata.missingletter

import spock.lang.Specification

class MissingLetterTest extends Specification {

    def "Missing Letters"() {
        expect:
            MissingLetter.findMissingLetter("abcdf".toCharArray()) == 'e' as char
            MissingLetter.findMissingLetter("OQRS".toCharArray()) == 'P' as char
    }
}
