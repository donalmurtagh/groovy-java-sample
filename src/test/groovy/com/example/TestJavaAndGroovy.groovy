package com.example

import spock.lang.Specification

class TestJavaAndGroovy extends Specification {

    def "test a Java class"() {
        expect:
        new JavaFoo().number == 22
    }

    def "test a Groovy class"() {
        when:
        def foo = new GroovyFoo()

        then:
        foo.number == 22
    }
}
