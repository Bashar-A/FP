package laba2
import org.scalatest.FunSuite

class RecursiveDataTests extends FunSuite{
    test("ListIntEmpty") {
        val list = Nil[Int]()
        val listIntEmpty = RecursiveData.testListIntEmpty(list)
        assert(listIntEmpty == true)
    }
    test("ListIntHead") {
        val list = Cons[Int](1 , Nil[Int]())
        val listIntHead = RecursiveData.testListIntHead(list)
        assert(listIntHead == 1)
    }
    
}