package lee.eulerproject

import lee.eulerproject.problem.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number5Test : Spek({

    describe("5번의 정답") {

        it("1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520이") {
            assertEquals(getNumber5Answer(10), 2520)
        }

        it("1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 232792560이다") {
            assertEquals(getNumber5Answer(20), 232792560)
        }
    }

    describe("isPrimeNumber가 제대로 동작하는지") {

        it("1은 소수가 아니다") {
            assertEquals(isPrimeNumber(1), false)
        }

        it("2는 소수이다") {
            assertEquals(isPrimeNumber(2), true)
        }

        it("3은 소수이다") {
            assertEquals(isPrimeNumber(3), true)
        }

        it("4는 소수가 아니다") {
            assertEquals(isPrimeNumber(4), false)
        }

        it("5은 소수이다") {
            assertEquals(isPrimeNumber(5), true)
        }

        it("6은 소수가 아니다") {
            assertEquals(isPrimeNumber(6), false)
        }

        it("7은 소수이다") {
            assertEquals(isPrimeNumber(7), true)
        }

        it("9는 소수가 아니다") {
            assertEquals(isPrimeNumber(9), false)
        }
    }

    describe("getCloseSquaerNumber 잘 동작을 하는지") {

        it("2의 제곱수 중에서 20에서 가장 근접 수는 16이다") {
            assertEquals(getCloseSquaerNumber(2, 20), 16)
        }

        it("3의 제곱수 중에서 20에서 가장 근접 수는 9이다") {
            assertEquals(getCloseSquaerNumber(3, 20), 9)
        }

        it("5의 제곱수 중에서 20에서 가장 근접 수는 5이다") {
            assertEquals(getCloseSquaerNumber(5, 20), 5)
        }
    }

    describe("getPrimeNumbers가 잘 동작을 하는지") {

        it("1까지에서의 소수는 없다") {
            assertEquals(getPrimeNumbers(1).isEmpty(), true)
        }

        it("2까지에서의 소수가 잘 뽑아진다") {
            assertEquals(getPrimeNumbers(2) == listOf(2), true)
        }

        it("20까지에서의 소수가 잘 뽑아진다") {
            assertEquals(getPrimeNumbers(20) == listOf(2, 3, 5, 7, 11, 13, 17, 19), true)
        }

        it("30까지에서의 소수가 잘 뽑아진다") {
            assertEquals(getPrimeNumbers(30) == listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), true)
        }
    }

    describe("getMultipleNumbers가 잘 동작을 하는지") {

        it("20까지의 소수 리스트의 근접수와 맟는다") {
            assertEquals(getMultipleNumbers(getPrimeNumbers(20), 20) == listOf(16, 9, 5, 7, 11, 13, 17, 19), true)
        }

        it("30까지의 소수 리스트와 근접수가 맞는다") {
            assertEquals(getMultipleNumbers(getPrimeNumbers(30), 30) == listOf(16, 27, 25, 7, 11, 13, 17, 19, 23, 29), true)
        }
    }
})