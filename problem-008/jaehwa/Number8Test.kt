package lee.eulerproject

import lee.eulerproject.problem.getMaxMultiple
import lee.eulerproject.problem.getMultiple
import lee.eulerproject.problem.numberString
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number8Test : Spek({

    describe("8번의 정답") {

        it("8번의 정답은") {
            assertEquals(getMaxMultiple(numberString), 40824)
        }
    }

    describe("getMaxMultiple 이 제대로 동작하는지?") {

        it("123450121 에서의 최대값은 120이다") {
            assertEquals(getMaxMultiple("123450121"), 120)
        }

        it("123457121 에서의 최대값은 840이다") {
            assertEquals(getMaxMultiple("123457121"), 840)
        }

        it("123407121 에서의 최대값은 0이다") {
            assertEquals(getMaxMultiple("123407121"), 0)
        }
    }

    describe("getMultiple 제대로 동작하는지") {

        it("12345 를 다 곱하면 120 이다") {
            assertEquals(getMultiple("12345"), 120)
        }

        it("10234 를 다 곱하면 0 이다") {
            assertEquals(getMultiple("10234"), 0)
        }

        it("12340 를 다 곱하면 0 이다") {
            assertEquals(getMultiple("12340"), 0)
        }

        it("11111 를 다 곱하면 1 이다") {
            assertEquals(getMultiple("11111"), 1)
        }

        it("22222 를 다 곱하면 32 이다") {
            assertEquals(getMultiple("22222"), 32)
        }

        it("123 를 다 곱하면 6 이다") {
            assertEquals(getMultiple("123"), 6)
        }
    }
})