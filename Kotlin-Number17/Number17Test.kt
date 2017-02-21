package lee.eulerproject

import lee.eulerproject.problem.getNumber17Answer
import lee.eulerproject.problem.getNumberLength
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number17Test : Spek({

    describe("17번의 정답을 구한다") {

        given("17번의 정답은") {

            val value = getNumber17Answer(1000)

            it("21124이다") {
                assertEquals(value, 21124)
            }
        }
    }

    describe("getNumberLength 잘 동작을 하는지") {

        it("101의 길이는 6이다") {
            assertEquals(getNumberLength(101), 16)
        }

        it("145의 길이는 6이다") {
            assertEquals(getNumberLength(145), 22)
        }

        it("210의 길이는 6이다") {
            assertEquals(getNumberLength(210), 16)
        }

        it("999의 길이는 6이다") {
            assertEquals(getNumberLength(999), 24)
        }

        it("15의 길이는 6이다") {
            assertEquals(getNumberLength(15), 7)
        }

        it("21의 길이는 6이다") {
            assertEquals(getNumberLength(21), 9)
        }

        it("6의 길이는 6이다") {
            assertEquals(getNumberLength(6), 3)
        }

        it("400의 길이는 6이다") {
            assertEquals(getNumberLength(400), 11)
        }

        it("701의 길이는 6이다") {
            assertEquals(getNumberLength(701), 18)
        }

        it("0의 길이는 0이다") {
            assertEquals(getNumberLength(0), 0)
        }

        it("-2의 길이는 0이다") {
            assertEquals(getNumberLength(-2), 0)
        }
    }
})