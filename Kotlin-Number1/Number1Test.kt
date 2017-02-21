package lee.eulerproject

import lee.eulerproject.problem.getGCD
import lee.eulerproject.problem.getLCM
import lee.eulerproject.problem.getNumber1Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number1Test : Spek({

    describe("1번의 해답") {

        it("1000 보다 작은 자연수 중에서 3 또는 5의 배수의 합은") {
            assertEquals(getNumber1Answer(5, 3, 1000), 233168)
        }

        it("10 보다 작은 자연수 중에서 3 또는 5의 배수의 합은") {
            assertEquals(getNumber1Answer(5, 3, 10), 23)
        }
    }

    describe("getGCD 가 제대로 값을 구하는지") {

        it("5,3 의 최대공약수는 1이다") {
            assertEquals(getGCD(5, 3), 1)
        }

        it("1,1 의 최대공약수는 1이다") {
            assertEquals(getGCD(1, 1), 1)
        }

        it("15,3 의 최대공약수는 3이다") {
            assertEquals(getGCD(15, 3), 3)
        }

        it("10,20 의 최대공약수는 10이다") {
            assertEquals(getGCD(10, 20), 10)
        }

        it("20,18 의 최대공약수는 2이다") {
            assertEquals(getGCD(20, 18), 2)
        }

        it("-1,5 의 최대공약수는 -1이다") {
            assertEquals(getGCD(-1, 5), -1)
        }
    }

    describe("getLCM 가 제대로 값을 구하는지") {

        it("5,3 의 최대공배수는 15이다") {
            assertEquals(getLCM(5, 3), 15)
        }

        it("15,20 의 최대공배수는 60이다") {
            assertEquals(getLCM(15, 20), 60)
        }

        it("1,3 의 최대공배수는 3이다") {
            assertEquals(getLCM(1, 3), 3)
        }

        it("4,2 의 최대공배수는 4이다") {
            assertEquals(getLCM(4, 2), 4)
        }

        it("10,3 의 최대공배수는 30이다") {
            assertEquals(getLCM(10, 3), 30)
        }

        it("4, -10의 최대 공배수는 -1이다") {
            assertEquals(getLCM(4, -10), -1)
        }
    }
})
