package laba1

import org.scalatest.FunSuite

class PatternsTests extends FunSuite{
    test("IntToString") {
        val intToString = PatternMatching.testIntToString(2)
        assert(intToString == "it is two")
    }
    test("IsMaxAndMoritz") {
        val isMaxAndMoritz = PatternMatching.testIsMaxAndMoritz("Max")
        assert(isMaxAndMoritz == true)
    }
    test("IsEven") {
        val isEven = PatternMatching.testIsEven(2)
        assert(isEven == true)
    }
    test("WinsA") {
        val winsA = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock)
        assert(winsA == PatternMatching.Win)
    }
    test("ExtractMammalWeight") {
        val extractMammalWeight = PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("mammal", PatternMatching.Meat, 100))
        assert(extractMammalWeight == 100)
    }
    test("UpdateFood") {
        val updateFood = PatternMatching.testUpdateFood(PatternMatching.Fish("mammal", PatternMatching.Meat))
        assert(updateFood.food == PatternMatching.Plants)
    }
}