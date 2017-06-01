package lee.eulerproject

import lee.eulerproject.problem.getNumber28Answer
import lee.eulerproject.problem.getNumber30Answer
import lee.eulerproject.problem.getPlusNumber
import lee.eulerproject.problem.getPlusNumbers
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number30Test : Spek({

    describe("30번의 정답을 구한다") {

        it("30번의 합은 0이다") {
            assertEquals(getNumber30Answer().sum(), 443839)
        }
    }
})