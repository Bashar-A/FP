package laba2

import org.scalatest.FunSuite

class RecursiveFuncTests extends FunSuite{
    test("Reverse") {
        val list = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val list2 = Cons[Int](3 , Cons[Int](2 , Cons[Int](1 , Nil[Int]())))
        val reverse = RecursiveFunctions.testReverse(list)
        assert(reverse == list2)
    }
    test("Map") {
        val list = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val list2 = Cons[Int](2 , Cons[Int](4 , Cons[Int](6 , Nil[Int]())))
        val func = (value: Int) => value * 2
        val map = RecursiveFunctions.testMap(list, func)
        assert(map == list2)
    }
    test("Append") {
        val list = Cons[Int](1 , Nil[Int]())
        val list2 = Cons[Int](2 , Cons[Int](3 , Nil[Int]()))
        val list3 = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val append = RecursiveFunctions.testAppend(list, list2)
        assert(append == list3)
    }
    test("FlatMap") {
        val func: List[Int] => List[Int] = _ match{
            case Cons(head, tail) => Cons(head,tail)
            case Nil() => Nil()
        }
        val list = Cons[Cons[Int]](Cons[Int](1 , Nil[Int]()), Cons[Cons[Int]](Cons[Int](2 , Nil[Int]()), Nil[Cons[Int]]()))
        val list1 = Cons[Int](1 , Cons[Int](2 , Nil[Int]()))
        val flatMap = RecursiveFunctions.testFlatMap(list, func)
        assert(flatMap == list1)
    }
}