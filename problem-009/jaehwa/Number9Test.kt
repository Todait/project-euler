package lee.eulerproject

import lee.eulerproject.problem.getEuclidFormulaPair
import lee.eulerproject.problem.getNumber9Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number9Test : Spek({

    describe("9번의 해답") {

        it("9번의 정답은 1이다") {
            assertEquals(getNumber9Answer(1000), 31875000)
        }
    }

    describe("getTriplePair 가 제대로 값을 구하는지") {

        it("sumNumber가 0이면 null 리턴") {
            assertEquals(getEuclidFormulaPair(0), null)
        }

        it("sumNumber의 m,n이 자연수가 아니라면 null 리턴") {
            assertEquals(getEuclidFormulaPair(13), null)
        }

        it("m >n 의 조건이 아니라면 null 리턴") {
            assertEquals(getEuclidFormulaPair(5), null)
        }

        it("500의 m, n의 값은 20, 5이다") {
            assertEquals(getEuclidFormulaPair(1000), Pair(20, 5))
        }
    }
})