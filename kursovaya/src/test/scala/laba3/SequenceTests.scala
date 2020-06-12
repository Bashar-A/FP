package laba3

import org.scalatest.FunSuite

class SequenceTests extends FunSuite{
    test("LastElement") {
        val seq = List(1,2,3)
        val res = Option(3)
        val lastElement = Sequence.testLastElement(seq)
        assert(lastElement == res)
    }
    test("Zip") {
        val seq1 = List(1,2)
        val seq2 = List(3,4)
        val res = List((1,3),(2,4))
        val zip = Sequence.testZip(seq1,seq2)
        assert(zip == res)
    }
    test("ForAll") {
        val seq = List(2,4,6,8)
        val func = (value: Int) => value % 2 == 0
        val res = true
        val forAll = Sequence.testForAll(seq)(func)
        assert(forAll == res)
    }
    test("Palindrom") {
        val seq = List(1,2,2,1)
        val res = true
        val palindrom = Sequence.testPalindrom(seq)
        assert(palindrom == res)
    }
    test("FlatMap") {
        val seq = List(1,2,3,4)
        val func = (value: Int) => List(value)
        val res = List(1,2,3,4)
        val flatMap = Sequence.testFlatMap(seq)(func)
        assert(flatMap == res)
    }

}