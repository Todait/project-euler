package lee.eulerproject

import lee.eulerproject.problem.getAnswer42
import lee.eulerproject.problem.isTriangleWord
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number42Test : Spek({

    describe("42번의 정답을 구한다") {

        it("42번의 합은 0이다") {
            assertEquals(getAnswer42(), 162)
        }
    }

    describe("isTriangleWord 가 맞냐? 틀리냐?") {

        it("SKY는 삼각수이다") {
            assertEquals(isTriangleWord("SKY"), true)
        }

        it("ABCD는 삼각수이다") {
            assertEquals(isTriangleWord("ABCD"), true)
        }

        it("ABCDG는 삼각수가 아니다") {
            assertEquals(isTriangleWord("ABCDG"), false)
        }
    }
})