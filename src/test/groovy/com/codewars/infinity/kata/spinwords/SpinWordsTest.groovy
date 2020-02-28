package com.codewars.infinity.kata.spinwords

import spock.lang.Specification

class SpinWordsTest extends Specification {

    def "'Welcome' must be transformed to 'emocleW'"() {
        expect:
            SpinWords.spinWords("Welcome") == "emocleW"
    }

    def "'Hey fellow warriors' must be transformed to 'Hey wollef sroirraw'"() {
        expect:
            SpinWords.spinWords("Hey fellow warriors") == "Hey wollef sroirraw"
    }
}
