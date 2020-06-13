package laba4

import org.scalatest.FunSuite

class TypeclassesTests extends FunSuite{
    test("ReversableString") {
        val string = "abc"
        val res = "cba"
        val reversableString = Typeclasses.testReversableString(string)
        assert(reversableString == res)
    }
    test("SmashInt") {
        val a = 3
        val b = 4
        val res = 7
        val smashInt = Typeclasses.testSmashInt(a, b)
        assert(smashInt == res)
    }
    test("SmashDouble") {
        val a = 3
        val b = 4
        val res = 12
        val smashDouble = Typeclasses.testSmashDouble(a, b)
        assert(smashDouble == res)
    }
    test("SmashString") {
        val a = "ab"
        val b = "cd"
        val res = "abcd"
        val smashString = Typeclasses.testSmashString(a, b)
        assert(smashString == res)
    }
}