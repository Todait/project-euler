package lee.eulerproject

import lee.eulerproject.problem.getPathCount
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.math.BigInteger
import java.util.*
import kotlin.test.assertEquals


class Number15Test : Spek({

    describe("15번의 정답") {

        it("15번의 정답은") {
            assertEquals(getPathCount(20), BigInteger("137846528820"))
        }
    }

    describe("getPathCount 이 제대로 동작하는지?") {

        it("1*1 격자에서 경로는 2개이다") {
            assertEquals(getPathCount(1), BigInteger("2"))
        }

        it("2*2 격자에서 경로는 6개이다") {
            assertEquals(getPathCount(2), BigInteger("6"))
        }

        it("3*3 격자에서 경로는 20개이다") {
            assertEquals(getPathCount(3), BigInteger("20"))
        }

        it("10*10 격자에서 경로는 20개이다") {
            assertEquals(getPathCount(10), BigInteger("184756"))
        }
    }
})