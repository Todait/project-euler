package lee.eulerproject

import lee.eulerproject.problem.getFactorialNumber
import lee.eulerproject.problem.getLexicographicOrder
import lee.eulerproject.problem.getNumber24Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals


class Number24Test : Spek({

    describe("24번의 정답을 구한다") {

        it("24번의 정답은") {
            assertEquals(getNumber24Answer(), "2783915460")
        }
    }

    describe("getLexicographicOrder가 잘 동작을 하는지") {

        on("numberArray 가 0,1,2,3 으로 이루어져 있을 시", {

            it("numberArray의 17번째 문자열은 2301 이다") {
                assertEquals(getLexicographicOrder(17, mutableListOf("0", "1", "2", "3")), "2301")
            }

            it("numberArray의 5번째 문자열은 0312 이다") {
                assertEquals(getLexicographicOrder(5, mutableListOf("0", "1", "2", "3")), "0312")
            }

            it("numberArray의 24번째 문자열은 3210 이다") {
                assertEquals(getLexicographicOrder(24, mutableListOf("0", "1", "2", "3")), "3210")
            }

            it("numberArray의 7번째 문자열은 1023 이다") {
                assertEquals(getLexicographicOrder(7, mutableListOf("0", "1", "2", "3")), "1023")
            }

            it("numberArray의 1번째 문자열은 0123 이다") {
                assertEquals(getLexicographicOrder(1, mutableListOf("0", "1", "2", "3")), "0123")
            }

            it("numberArray의 0번째 문자열은 없다고 뜬다") {
                assertEquals(getLexicographicOrder(0, mutableListOf("0", "1", "2", "3")), "0번쨰 순서는 없습니다")
            }

            it("numberArray의 25번째 문자열은 순서가 초과되었습니다라고 뜬다") {
                assertEquals(getLexicographicOrder(25, mutableListOf("0", "1", "2", "3")), "순서가 초과되었습니다")
            }
        })

        on("numberArray 가 0,1,2 으로 이루어져 있을 시", {

            it("numberArray의 0번째 문자열은 없다고 뜬다") {
                assertEquals(getLexicographicOrder(0, mutableListOf("0", "1", "2")), "0번쨰 순서는 없습니다")
            }

            it("numberArray의 1번째 문자열은 012 이다") {
                assertEquals(getLexicographicOrder(1, mutableListOf("0", "1", "2")), "012")
            }

            it("numberArray의 3번째 문자열은 102 이다") {
                assertEquals(getLexicographicOrder(3, mutableListOf("0", "1", "2")), "102")
            }

            it("numberArray의 5번째 문자열은 201 이다") {
                assertEquals(getLexicographicOrder(5, mutableListOf("0", "1", "2")), "201")
            }

            it("numberArray의 7번째 문자열은 순서가 초과되었습니다라고 뜬다") {
                assertEquals(getLexicographicOrder(7, mutableListOf("0", "1", "2")), "순서가 초과되었습니다")
            }
        })
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
    }

})