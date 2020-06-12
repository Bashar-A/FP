package laba3

import org.scalatest.FunSuite

class StringsTests extends FunSuite{
    test("Uppercase") {
        val string = "aaa"
        val res = "AAA"
        val uppercase = Strings.testUppercase(string)
        assert(uppercase == res)
    }
    test("Interpolations") {
        val name = "Bashar"
        val res = "Hi my name is Bashar and I am 20 years old."
        val interpolations = Strings.testInterpolations(name, 20)
        assert(interpolations == res)
    }
    test("Computation") {
        val res = "Hi, \n now follows a quite hard calculation. We try ta add: \n\ta := 5 \n\tb := 10\n\n\tresult is 15"
        val computation = Strings.testComputation(5, 10)
        assert(computation == res)
    }
    test("TakeTwo") {
        val string = "test"
        val res = "te"
        val takeTwo = Strings.testTakeTwo(string)
        assert(takeTwo == res)
    }
}