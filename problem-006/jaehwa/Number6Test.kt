package lee.eulerproject

import lee.eulerproject.problem.getNumber6Answer
import lee.eulerproject.problem.getSquareOfSum
import lee.eulerproject.problem.getSumOfSquare
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number6Test : Spek({

    describe("6번의 정답") {

        it("10까지의 합의 제곱과 제곱의 합의 차는 2640이다") {
            assertEquals(getNumber6Answer(10), 2640)
        }

        it("100까지의 합의 제곱과 제곱의 합의 차는 25164150이다") {
            assertEquals(getNumber6Answer(100), 25164150)
        }
    }

    describe("getSumOfSquare가 제대로 동작하는지") {

        it("-1까지 제곱의 합은 0이다") {
            assertEquals(getSumOfSquare(-1), null)
        }

        it("1까지 제곱의 합은 1이다") {
            assertEquals(getSumOfSquare(1), 1)
        }

        it("2까지의 제곱의 합은 5이다") {
            assertEquals(getSumOfSquare(2), 5)
        }

        it("3까지의 제곱의 합은 14이다") {
            assertEquals(getSumOfSquare(3), 14)
        }

        it("4까지의 제곱의 합은 30이다") {
            assertEquals(getSumOfSquare(4), 30)
        }

        it("10까지의 제곱의 합은 385이다") {
            assertEquals(getSumOfSquare(10), 385)
        }
    }

    describe("getSquareOfSum 제대로 동작하는지") {

        it("-1까지 합의 제곱은 0이다") {
            assertEquals(getSquareOfSum(-1), null)
        }

        it("1까지 합의 제곱은 1이다") {
            assertEquals(getSquareOfSum(1), 1)
        }

        it("2까지의 합의 제곱은 9이다") {
            assertEquals(getSquareOfSum(2), 9)
        }

        it("3까지의 합의 제곱은 36이다") {
            assertEquals(getSquareOfSum(3), 36)
        }

        it("4까지의 합의 제곱은 100이다") {
            assertEquals(getSquareOfSum(4), 100)
        }

        it("10까지의 합의 제곱은 3025이다") {
            assertEquals(getSquareOfSum(10), 3025)
        }
    }

})