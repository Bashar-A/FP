package laba3

import org.scalatest.FunSuite

class MapsTests extends FunSuite{
    test("GroupUsers") {
        val user1 = new Maps.User("Bashar", 15)
        val user2 = new Maps.User("Maxim", 20)
        val user3 = new Maps.User("Dima", 20)
        val seq = Seq(user1,user2,user3)
        val res = Map(("Bashar", 18),("Maxim", 18),("Dima", 18))
        val groupUsers = Maps.testGroupUsers(seq)
        assert(groupUsers == res)
    }
    test("NumberFrodos") {
        val user1 = new Maps.User("AdamBashar", 20)
        val user2 = new Maps.User("Maxim", 20)
        val user3 = new Maps.User("AdamDima", 20)
        val map = Map(("AdamBash", user1),("AdamMaxim", user2),("Dima", user3))
        val res = 2
        val numberFrodos = Maps.testNumberFrodos(map)
        assert(numberFrodos == res)
    }
    test("Underaged") {
        val user1 = new Maps.User("Bashar", 40)
        val user2 = new Maps.User("Maxim", 30)
        val user3 = new Maps.User("Dima", 37)
        val map = Map(("Bash", user1),("Maxim", user2),("Dima", user3))
        val res = Map(("Bash", user1),("Dima", user3))
        val underaged = Maps.testUnderaged(map)
        assert(underaged == res)
    }
}