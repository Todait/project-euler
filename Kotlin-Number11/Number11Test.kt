package lee.eulerproject

import lee.eulerproject.problem.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number11Test : Spek({

    describe("11번의 정답을 구한다") {

        it("11번의 정답은 70600674이다") {
            assertEquals(getNumber11Answer(), 70600674)
        }

    }

    describe("getHorizontalMaxValue() 테스트") {

        it("getHorizontalMaxValue()의 답은 ") {
            assertEquals(getHorizontalMaxValue(), 48477312)
        }
    }

    describe("getVerticalMaxValue() 테스트") {

        it("getVerticalMaxValue()의 답은 ") {
            assertEquals(getVerticalMaxValue(), 52043992)
        }
    }

    describe("getTopRightToBottomLeftMaxValue() 테스트") {

        it("getTopRightToBottomLeftMaxValue()의 답은 ") {
            assertEquals(getTopRightToBottomLeftMaxValue(), 70600674)
        }
    }

    describe("getTopLeftToBottomRightMaxValue() 테스트") {

        it("getTopLeftToBottomRightMaxValue()의 답은 ") {
            assertEquals(getTopLeftToBottomRightMaxValue(), 29481408)
        }
    }

    describe("getMultple 기능 테스트") {

        given("4개의 숫자가 1,0,2,1 이라고 설정됨") {

            val a = 1
            val b = 0
            val c = 2
            val d = 1

            it("4개의 숫자를 곱할 때 0이 나온다") {
                assertEquals(getMultple(a, b, c, d), 0)
            }
        }

        given("4개의 숫자가 1,2,3,4 이라고 설정됨") {

            val a = 1
            val b = 2
            val c = 3
            val d = 4

            it("4개의 숫자를 곱할 때 24가 나온다") {
                assertEquals(getMultple(a, b, c, d), 24)
            }
        }

        given("4개의 숫자가 1,0,0,4 이라고 설정됨") {

            val a = 1
            val b = 0
            val c = 0
            val d = 4

            it("4개의 숫자를 곱할 때 0이 나온다") {
                assertEquals(getMultple(a, b, c, d), 0)
            }
        }

        given("4개의 숫자가 1,0,0,0 이라고 설정됨") {

            val a = 1
            val b = 0
            val c = 0
            val d = 0

            it("4개의 숫자를 곱할 때 0이 나온다") {
                assertEquals(getMultple(a, b, c, d), 0)
            }
        }

        given("4개의 숫자가 0,0,0,0 이라고 설정됨") {

            val a = 0
            val b = 0
            val c = 0
            val d = 0

            it("4개의 숫자를 곱할 때 0이 나온다") {
                assertEquals(getMultple(a, b, c, d), 0)
            }
        }

        given("4개의 숫자가 1,1,1,1 이라고 설정됨") {

            val a = 1
            val b = 1
            val c = 1
            val d = 1

            it("4개의 숫자를 곱할 때 1이 나온다") {
                assertEquals(getMultple(a, b, c, d), 1)
            }
        }
    }
})