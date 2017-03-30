package lee.eulerproject

import lee.eulerproject.problem.getMonthDay
import lee.eulerproject.problem.getNumber19Answer
import lee.eulerproject.problem.isLeapYear
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number19Test : Spek({

    describe("19번의 정답을 구한다") {

        it("19번의 정답은") {
            assertEquals(getNumber19Answer(), 171)
        }
    }


    describe("getMonthDay 가 잘 동작을 하는지") {

        it("1700은 30,31,28이 나온다") {
            assertEquals(getMonthDay(1700) == Triple(30, 31, 28), true)
        }

        it("1901은 30,31,28이 나온다") {
            assertEquals(getMonthDay(1901) == Triple(30, 31, 28), true)
        }

        it("1904은 30,31,29이 나온다") {
            assertEquals(getMonthDay(1904) == Triple(30, 31, 29), true)
        }

        it("2000은 30,31,29이 나온다") {
            assertEquals(getMonthDay(2000) == Triple(30, 31, 29), true)
        }

        it("1800은 30,31,28이 나온다") {
            assertEquals(getMonthDay(1800) == Triple(30, 31, 28), true)
        }

        it("2017은 30,31,28이 나온다") {
            assertEquals(getMonthDay(2017) == Triple(30, 31, 28), true)
        }
    }


    describe("isLeapYear가 잘 동작을 하는지") {

        it("1700은 윤년이 아니다") {
            assertEquals(isLeapYear(1700), false)
        }

        it("1901은 윤년이 아니다") {
            assertEquals(isLeapYear(1901), false)
        }

        it("1904은 윤년이다") {
            assertEquals(isLeapYear(1904), true)
        }

        it("2000은 윤년이다") {
            assertEquals(isLeapYear(2000), true)
        }

        it("1800은 윤년이 아니다") {
            assertEquals(isLeapYear(1800), false)
        }

        it("2017은 윤년이 아니다") {
            assertEquals(isLeapYear(2017), false)
        }
    }
})