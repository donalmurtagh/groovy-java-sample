package com.example

import spock.lang.Specification

class TestJavaAndGroovy extends Specification {

    def "test a Java class"() {
        expect:
        new JavaFoo().get22() == 22
    }

    def "test a Groovy class"() {
        when:
        def foo = new GroovyFoo()

        then:
        foo.get22() == 22
    }
}
