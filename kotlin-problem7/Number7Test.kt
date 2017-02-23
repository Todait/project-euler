package lee.eulerproject

import lee.eulerproject.problem.getPrimeNumber
import lee.eulerproject.problem.isPrimeNumberUsingForLoop
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number7Test : Spek({

    describe("5번의 정답") {

        it("10,001번쨰 소수는 0이다") {
            assertEquals(getPrimeNumber(10001), 104743)
        }
    }

    describe("getPrimeNumber가 제대로 동작하는지") {

        it("음수번쨰 소수는 0이다") {
            assertEquals(getPrimeNumber(-1), 0)
        }

        it("첫번째 소수는 2이다") {
            assertEquals(getPrimeNumber(1), 2)
        }

        it("두번째 소수는 3이다") {
            assertEquals(getPrimeNumber(2), 3)
        }

        it("세번째 소수는 5이다") {
            assertEquals(getPrimeNumber(3), 5)
        }

        it("네번째 소수는 7이다") {
            assertEquals(getPrimeNumber(4), 7)
        }
    }

    describe("isPrimeNumberUsingForLoop가 제대로 동작하는지") {

        it("1은 소수가 아니다") {
            assertEquals(isPrimeNumberUsingForLoop(1), false)
        }

        it("2는 소수이다") {
            assertEquals(isPrimeNumberUsingForLoop(2), true)
        }

        it("3은 소수이다") {
            assertEquals(isPrimeNumberUsingForLoop(3), true)
        }

        it("4는 소수가 아니다") {
            assertEquals(isPrimeNumberUsingForLoop(4), false)
        }

        it("5은 소수이다") {
            assertEquals(isPrimeNumberUsingForLoop(5), true)
        }

        it("6은 소수가 아니다") {
            assertEquals(isPrimeNumberUsingForLoop(6), false)
        }

        it("7은 소수이다") {
            assertEquals(isPrimeNumberUsingForLoop(7), true)
        }

        it("9는 소수가 아니다") {
            assertEquals(isPrimeNumberUsingForLoop(9), false)
        }

        it("104743는 소수다") {
            assertEquals(isPrimeNumberUsingForLoop(104743), true)
        }
    }
})