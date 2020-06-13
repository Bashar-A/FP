package laba3

import scala.util.{Failure, Success, Try}
import org.scalatest.FunSuite

class Laba3Tests extends FunSuite{
    test("Adts - GetNth") {
        val list = List(1,5,8,9,10)
        val n = 3
        val res = Some(9)
        val getNth = Adts.testGetNth(list,n)
        assert(getNth == res)
    }
    test("Adts - Double") {
        val list = Option(2)
        val res = Option(4)
        val double = Adts.testDouble(list)
        assert(double == res)
    }
    test("Adts - IsEven") {
        val n = 13
        val res = Left("Нечетное число")
        val isEven = Adts.testIsEven(n)
        assert(isEven == res)
    }
    test("Adts - SafeDivide") {
        val n1 = 20
        val n2 = 0
        val res = Left("Вы не можете делить на ноль")
        val safeDivide = Adts.testSafeDivide(n1,n2)
        assert(safeDivide == res)
    }
    test("Adts - GoodOldJava") {
        val string = "test"
        val func = (s:String) => s.size
        val res = Success(4)
        val goodOldJava = Adts.testGoodOldJava(func,string)
        assert(goodOldJava == res)
    }
    test("Maps - GroupUsers") {
        val user1 = new Maps.User("Bashar", 15)
        val user2 = new Maps.User("Maxim", 20)
        val user3 = new Maps.User("Dima", 20)
        val seq = Seq(user1,user2,user3)
        val res = Map(("Bashar", 18),("Maxim", 18),("Dima", 18))
        val groupUsers = Maps.testGroupUsers(seq)
        assert(groupUsers == res)
    }
    test("Maps - NumberFrodos") {
        val user1 = new Maps.User("AdamBashar", 20)
        val user2 = new Maps.User("Maxim", 20)
        val user3 = new Maps.User("AdamDima", 20)
        val map = Map(("AdamBash", user1),("AdamMaxim", user2),("Dima", user3))
        val res = 2
        val numberFrodos = Maps.testNumberFrodos(map)
        assert(numberFrodos == res)
    }
    test("Maps - Underaged") {
        val user1 = new Maps.User("Bashar", 40)
        val user2 = new Maps.User("Maxim", 30)
        val user3 = new Maps.User("Dima", 37)
        val map = Map(("Bash", user1),("Maxim", user2),("Dima", user3))
        val res = Map(("Bash", user1),("Dima", user3))
        val underaged = Maps.testUnderaged(map)
        assert(underaged == res)
    }
    test("Sequence - LastElement") {
        val seq = List(1,2,3)
        val res = Option(3)
        val lastElement = Sequence.testLastElement(seq)
        assert(lastElement == res)
    }
    test("Sequence - Zip") {
        val seq1 = List(1,2)
        val seq2 = List(3,4)
        val res = List((1,3),(2,4))
        val zip = Sequence.testZip(seq1,seq2)
        assert(zip == res)
    }
    test("Sequence - ForAll") {
        val seq = List(2,4,6,8)
        val func = (value: Int) => value % 2 == 0
        val res = true
        val forAll = Sequence.testForAll(seq)(func)
        assert(forAll == res)
    }
    test("Sequence - Palindrom") {
        val seq = List(1,2,2,1)
        val res = true
        val palindrom = Sequence.testPalindrom(seq)
        assert(palindrom == res)
    }
    test("Sequence - FlatMap") {
        val seq = List(1,2,3,4)
        val func = (value: Any) => List(List(value))
        val res = List(List(1),List(2),List(3),List(4))
        val flatMap = Sequence.testFlatMap(seq)(func)
        assert(flatMap == res)
    }
    test("Strings - Uppercase") {
        val string = "aaa"
        val res = "AAA"
        val uppercase = Strings.testUppercase(string)
        assert(uppercase == res)
    }
    test("Strings - Interpolations") {
        val name = "Bashar"
        val res = "Hi my name is Bashar and I am 20 years old."
        val interpolations = Strings.testInterpolations(name, 20)
        assert(interpolations == res)
    }
    test("Strings - Computation") {
        val res = "Hi, \n now follows a quite hard calculation. We try ta add: \n\ta := 5 \n\tb := 10\n\n\tresult is 15"
        val computation = Strings.testComputation(5, 10)
        assert(computation == res)
    }
    test("Strings - TakeTwo") {
        val string = "test"
        val res = "te"
        val takeTwo = Strings.testTakeTwo(string)
        assert(takeTwo == res)
    }
}