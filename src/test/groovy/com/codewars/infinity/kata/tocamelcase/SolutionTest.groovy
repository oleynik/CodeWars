package com.codewars.infinity.kata.tocamelcase

import spock.lang.Specification

class SolutionTest extends Specification {

    def "'the_Stealth_Warrior' must be transformed to 'theStealthWarrior'"() {
        setup:
            String input = "the_Stealth_Warrior"
        when:
            String result = Solution.toCamelCase(input)
        then:
            result == "theStealthWarrior"
    }

    def "'The_Stealth_Warrior' must be transformed to 'TheStealthWarrior'"() {
        setup:
            String input = "The_Stealth_Warrior"
        when:
            String result = Solution.toCamelCase(input)
        then:
            result == "TheStealthWarrior"
    }

    def "'the-Stealth-Warrior' must be transformed to 'theStealthWarrior'"() {
        setup:
            String input = "the-Stealth-Warrior"
        when:
            String result = Solution.toCamelCase(input)
        then:
            result == "theStealthWarrior"
    }

    def "'The-Stealth-Warrior' must be transformed to 'TheStealthWarrior'"() {
        setup:
            String input = "The-Stealth-Warrior"
        when:
            String result = Solution.toCamelCase(input)
        then:
            result == "TheStealthWarrior"
    }
}
