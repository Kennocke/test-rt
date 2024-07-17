package ru.svitkovskiy

import spock.lang.Specification

class MainGroovyTest extends Specification {
    def "Test countElements with #list"() {
        expect:
            MainGroovy.countElements(list) == expectedMap
        where:
            list               | expectedMap
            [1, 1, 2, 2, 3, 3] | [1: 2, 2: 2, 3: 2]
            ['A', 1, 'D', 'D'] | ['A': 1, 1: 1, 'D': 2]
            []                 | [:]
            null               | [:]
    }
}
