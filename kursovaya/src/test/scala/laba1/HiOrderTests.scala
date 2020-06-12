package laba1

import org.scalatest.FunSuite

class HiOrderTests extends FunSuite{
    test("NTimes") {
        val nTimes = HigherOrder.testNTimes(HigherOrder.plus, 3 ,2 ,5)
        assert(nTimes == 25)
    }
    test("AnonymousNTimes") {
        val anonymousNTimes = HigherOrder.testAnonymousNTimes(3 ,2 ,5)
        assert(anonymousNTimes == 15)
    }
}