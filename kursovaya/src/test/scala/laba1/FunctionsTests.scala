package laba1

import org.scalatest.FunSuite

class FunctionsTests extends FunSuite{
    test("CircleArea") {
        val circleArea = Functions.testCircle(3.0)
        assert(circleArea == 28.274333882308138)
    }
    test("RectangleCurriedArea") {
        val rectangleAreaCurried = Functions.testRectangleCurried(3.0, 4.0)
        assert(rectangleAreaCurried == 12.0)
    }
    test("RectangleUcArea") {
        val rectangleArea = Functions.testRectangleUc(3.0, 4.0)
        assert(rectangleArea == 12.0)
    }
}