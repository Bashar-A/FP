package laba3

import org.scalatest.FunSuite

class SequenceTests extends FunSuite{
    test("LastElement") {
        val seq = Seq[Int](1,2,3)
        val res = seq.last
        val lastElement = Sequence.testLastElement(seq)
        assert(lastElement == res)
    }
}