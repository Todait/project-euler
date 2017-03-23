package lee.eulerproject

import lee.eulerproject.problem.getNumber3Answer
import lee.eulerproject.problem.getPrimeFactors
import lee.eulerproject.problem.isPrimeNumber
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number3Test : Spek({

    describe("3번의 정답을 구한다") {

        it("600851475143에서 제일 큰 소인 수는 6857 이다") {
            assertEquals(getNumber3Answer(600851475143), 6857)
        }
    }

    describe("getPrimeFactors 잘 동작을 하는지") {

        it("1까지에서의 소인수는 없다") {
            assertEquals(getPrimeFactors(1L).isEmpty(), true)
        }

        it("2까지에서의 소인수가 잘 뽑아진다") {
            assertEquals(getPrimeFactors(2L) == mutableSetOf(2L), true)
        }

        it("20까지에서의 소인수가 잘 뽑아진다") {
            assertEquals(getPrimeFactors(20L) == mutableSetOf(2L, 5L), true)
        }

        it("30까지에서의 소인수가 잘 뽑아진다") {
            assertEquals(getPrimeFactors(30L) == mutableSetOf(2L, 3L, 5L), true)
        }

        it("13195까지에서의 소인수가 잘 뽑아진다") {
            assertEquals(getPrimeFactors(13195L) == mutableSetOf(5L, 7L, 13L, 29L), true)
        }
    }
})