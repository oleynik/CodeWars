package com.codewars.infinity.kata.scramblies

import spock.lang.Specification
import spock.lang.Unroll

class ScrambliesTest extends Specification {

    @Unroll
    def "Scrambling from #abc to #word return #result"() {
        expect:
            Scramblies.scramble(abc, word) == result
        where:
        abc                 |   word            ||  result
        "rkqodlw"           |   "world"         ||  true
        "cedewaraaossoqqyt" |   "codewars"      ||  true
        "katas"             |   "steak"         ||  false
        "scriptjavx"        |   "javascript"    ||  false
        "scriptingjava"     |   "javascript"    ||  true
        "scriptsjava"       |   "javascripts"   ||  true
        "javscripts"        |   "javascript"    ||  false
        "aabbcamaomsccdd"   |   "commas"        ||  true
        "commas"            |   "commas"        ||  true
        "sammoc"            |   "commas"        ||  true
    }
}
