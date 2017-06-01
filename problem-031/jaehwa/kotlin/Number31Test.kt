package lee.eulerproject

import lee.eulerproject.problem.getAnswer31
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number31Test : Spek({

    describe("31번의 정답을 구한다") {

        it("31번의 합은 0이다") {
            assertEquals(getAnswer31(), 932718654)
        }
    }
})