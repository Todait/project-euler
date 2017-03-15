package lee.eulerproject

import lee.eulerproject.problem.getNumber4Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number4Test : Spek({

    describe("4번의 정답을 구한다") {

        given("4번의 정답은") {

            val value = getNumber4Answer()
            it("906609이다") {
                assertEquals(value, 906609)
            }
        }
    }
})