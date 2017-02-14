package lee.eulerproject

import lee.eulerproject.problem.getNumber11Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals


class Number11Test : Spek({

    describe("11번의 정답을 구한다") {

        given("11번의 정답은") {

            val value = getNumber11Answer()

            it("70600674이다") {
                assertEquals(value, 70600674)
            }
        }
    }
})