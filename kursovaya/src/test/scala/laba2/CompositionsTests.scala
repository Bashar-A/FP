package laba2

import org.scalatest.FunSuite

class CompositionsTests extends FunSuite{
    test("Compose") {
        val f = (value: Int) => value * 13
        val g = (value: Int) => value + 13
        val h = (value: Int) => value - 13
        val res = (value: Int) => value * 13 + 13 - 13
        val compose = Compositions.testCompose(f)(g)(h)
        assert(compose(10) == res(10))
    }
    test("MapFlatMap") {
        val f = (value:Int) => Some[Int](value)
        val g = (value:Int) => Some[Int](value)
        val h = (value: Int) => value - 13
        val res = Some[Int](-11)
        val mapFlatMap = Compositions.testMapFlatMap(f)(g)(h)
        assert(mapFlatMap(Some[Int](2)) == res)
    }
    test("ForComprehension") {
        val f = (value:Int) => Some[Int](value)
        val g = (value:Int) => Some[Int](value)
        val h = (value: Int) => value - 13
        val res = Some[Int](-11)
        val forComprehension = Compositions.testForComprehension(f)(g)(h)
        assert(forComprehension(Some[Int](2)) == res)
    }
}