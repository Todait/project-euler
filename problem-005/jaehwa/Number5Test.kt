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
})