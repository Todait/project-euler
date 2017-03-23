package lee.eulerproject.common

import lee.eulerproject.problem.getFactorialNumber
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class CommonTest : Spek({

    describe("getPrimes 잘 동작을 하는지") {

        it("1까지에서의 소수는 없다") {
            assertEquals(1.getPrimes().isEmpty(), true)
        }

        it("2까지에서의 소수가 잘 뽑아진다") {
            assertEquals(2.getPrimes() == listOf(2), true)
        }

        it("20까지에서의 소수가 잘 뽑아진다") {
            assertEquals(20.getPrimes() == listOf(2, 3, 5, 7, 11, 13, 17, 19), true)
        }

        it("30까지에서의 소수가 잘 뽑아진다") {
            assertEquals(30.getPrimes() == listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), true)
        }
    }


    describe("getFactorialNumber가 잘 동작을 하는지") {

        it("-1의 getFactorialNumber는 null이다") {
            assertEquals(getFactorialNumber(-1), null)
        }

        it("0의 getFactorialNumber는 1이다") {
            assertEquals(getFactorialNumber(0), 1)
        }

        it("1의 getFactorialNumber는 1이다") {
            assertEquals(getFactorialNumber(1), 1)
        }

        it("2의 getFactorialNumber는 2이다") {
            assertEquals(getFactorialNumber(2), 2)
        }

        it("5의 getFactorialNumber는 120이다") {
            assertEquals(getFactorialNumber(5), 120)
        }

        it("6의 getFactorialNumber는 720이다") {
            assertEquals(getFactorialNumber(6), 720)
        }

        it("6의 getFactorialNumber는 720이다") {
            assertEquals(getFactorialNumber(6), 720)
        }
    }
})