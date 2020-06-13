package laba1

import org.scalatest.FunSuite

class Laba1Tests extends FunSuite{
    test("Functions - CircleArea") {
        val circleArea = Functions.testCircle(3.0)
        assert(circleArea == 28.274333882308138)
    }
    test("Functions - RectangleCurriedArea") {
        val rectangleAreaCurried = Functions.testRectangleCurried(3.0, 4.0)
        assert(rectangleAreaCurried == 12.0)
    }
    test("Functions - RectangleUcArea") {
        val rectangleArea = Functions.testRectangleUc(3.0, 4.0)
        assert(rectangleArea == 12.0)
    }
    test("HigherOrder - NTimes") {
        val nTimes = HigherOrder.testNTimes(HigherOrder.plus, 3 ,2 ,5)
        assert(nTimes == 25)
    }
    test("HigherOrder - AnonymousNTimes") {
        val anonymousNTimes = HigherOrder.testAnonymousNTimes(3 ,2 ,5)
        assert(anonymousNTimes == 15)
    }
    test("PatternMatching - IntToString") {
        val intToString = PatternMatching.testIntToString(2)
        assert(intToString == "it is two")
    }
    test("PatternMatching - IsMaxAndMoritz") {
        val isMaxAndMoritz = PatternMatching.testIsMaxAndMoritz("Max")
        assert(isMaxAndMoritz == true)
    }
    test("PatternMatching - IsEven") {
        val isEven = PatternMatching.testIsEven(2)
        assert(isEven == true)
    }
    test("PatternMatching - WinsA") {
        val winsA = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock)
        assert(winsA == PatternMatching.Win)
    }
    test("PatternMatching - ExtractMammalWeight") {
        val extractMammalWeight = PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("mammal", PatternMatching.Meat, 100))
        assert(extractMammalWeight == 100)
    }
    test("PatternMatching - UpdateFood") {
        val updateFood = PatternMatching.testUpdateFood(PatternMatching.Fish("mammal", PatternMatching.Meat))
        assert(updateFood.food == PatternMatching.Plants)
    }
}