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
        val nTimes1 = HigherOrder.testNTimes(HigherOrder.plus, 3 ,2 ,5)
        assert(nTimes1 == 25)
        val nTimes2 = HigherOrder.testNTimes(HigherOrder.multiply, 3 ,2 ,5)
        assert(nTimes2 == 30)
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
        assert(PatternMatching.testIsMaxAndMoritz("Max") == true)
        assert(PatternMatching.testIsMaxAndMoritz("max") == true)
        assert(PatternMatching.testIsMaxAndMoritz("Moritz") == true)
        assert(PatternMatching.testIsMaxAndMoritz("moritz") == true)
        assert(PatternMatching.testIsMaxAndMoritz("test") == false)
    }
    test("PatternMatching - IsEven") {
        val isEven = PatternMatching.testIsEven(2)
        assert(isEven == true)
    }
    test("PatternMatching - WinsA") {
        val winsA1 = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Scissor)
        assert(winsA1 == PatternMatching.Lose)
        val winsA2 = PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Scissor)
        assert(winsA2 == PatternMatching.Win)
        val winsA3 = PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Scissor)
        assert(winsA3 == PatternMatching.Draw)
    }
    test("PatternMatching - ExtractMammalWeight") {
        val extractMammalWeight1 = PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("mammal", PatternMatching.Meat, 100))
        assert(extractMammalWeight1 == 100)
        val extractMammalWeight2 = PatternMatching.testExtractMammalWeight(PatternMatching.Fish("fish", PatternMatching.Meat))
        assert(extractMammalWeight2 == -1)
    }
    test("PatternMatching - UpdateFood") {
        val updateFood1 = PatternMatching.testUpdateFood(PatternMatching.Fish("fish", PatternMatching.Meat))
        assert(updateFood1.food == PatternMatching.Plants)
        val updateFood2 = PatternMatching.testUpdateFood(PatternMatching.Mammal("mammal", PatternMatching.Meat, 100))
        assert(updateFood2.food == PatternMatching.Meat)
    }
}