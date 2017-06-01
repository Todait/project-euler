package lee.eulerproject

import lee.eulerproject.problem.getAnswer39
import lee.eulerproject.problem.getAnswer42
import lee.eulerproject.problem.isTriangleWord
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number39Test  : Spek({

    describe("39번의 정답을 구한다") {

        it("39번의 합은 0이다") {
            assertEquals(getAnswer39(1000), 840)
        }
    }
})