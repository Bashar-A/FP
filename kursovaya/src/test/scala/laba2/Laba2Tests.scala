package laba2

import org.scalatest.FunSuite

class Laba2Tests extends FunSuite{
    test("Compositions - Compose") {
        val f = (value: Int) => value * 13
        val g = (value: Int) => value + 13
        val h = (value: Int) => value - 13
        val res = (value: Int) => value * 13 + 13 - 13
        val compose = Compositions.testCompose(f)(g)(h)
        assert(compose(10) == res(10))
    }
    test("Compositions - MapFlatMap") {
        val f = (value:Int) => Some[Int](value)
        val g = (value:Int) => Some[Int](value)
        val h = (value: Int) => value - 13
        val res = Some[Int](-11)
        val mapFlatMap = Compositions.testMapFlatMap(f)(g)(h)
        assert(mapFlatMap(Some[Int](2)) == res)
    }
    test("Compositions - ForComprehension") {
        val f = (value:Int) => Some[Int](value)
        val g = (value:Int) => Some[Int](value)
        val h = (value: Int) => value - 13
        val res = Some[Int](-11)
        val forComprehension = Compositions.testForComprehension(f)(g)(h)
        assert(forComprehension(Some[Int](2)) == res)
    }
    test("RecursiveData - ListIntEmpty") {
        val list = Nil[Int]()
        val listIntEmpty = RecursiveData.testListIntEmpty(list)
        assert(listIntEmpty == true)
    }
    test("RecursiveData - ListIntHead") {
        val list = Cons[Int](1 , Nil[Int]())
        val listIntHead = RecursiveData.testListIntHead(list)
        assert(listIntHead == 1)
    }
    test("RecursiveFunctions - Reverse") {
        val list = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val list2 = Cons[Int](3 , Cons[Int](2 , Cons[Int](1 , Nil[Int]())))
        val reverse = RecursiveFunctions.testReverse(list)
        assert(reverse == list2)
    }
    test("RecursiveFunctions - Map") {
        val list = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val list2 = Cons[Int](2 , Cons[Int](4 , Cons[Int](6 , Nil[Int]())))
        val func = (value: Int) => value * 2
        val map = RecursiveFunctions.testMap(list, func)
        assert(map == list2)
    }
    test("RecursiveFunctions - Append") {
        val list = Cons[Int](1 , Nil[Int]())
        val list2 = Cons[Int](2 , Cons[Int](3 , Nil[Int]()))
        val list3 = Cons[Int](1 , Cons[Int](2 , Cons[Int](3 , Nil[Int]())))
        val append = RecursiveFunctions.testAppend(list, list2)
        assert(append == list3)
    }
    test("RecursiveFunctions - FlatMap") {
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