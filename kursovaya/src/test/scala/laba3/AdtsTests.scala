package laba3

import scala.util.{Failure, Success, Try}
import org.scalatest.FunSuite

class AdtsTests extends FunSuite{
    test("GetNth") {
        val list = List(1,2,3,4,5)
        val n = 2
        val res = Some(3)
        val getNth = Adts.testGetNth(list,n)
        assert(getNth == res)
    }
    test("Double") {
        val list = Option(2)
        val res = Option(4)
        val double = Adts.testDouble(list)
        assert(double == res)
    }
    test("IsEven") {
        val n = 13
        val res = Left("Нечетное число")
        val isEven = Adts.testIsEven(n)
        assert(isEven == res)
    }
    test("SafeDivide") {
        val n1 = 20
        val n2 = 0
        val res = Left("Вы не можете делить на ноль")
        val safeDivide = Adts.testSafeDivide(n1,n2)
        assert(safeDivide == res)
    }
    test("GoodOldJava") {
        val string = "test"
        val func = (s:String) => s.size
        val res = Success(4)
        val goodOldJava = Adts.testGoodOldJava(func,string)
        assert(goodOldJava == res)
    }
}