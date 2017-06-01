package lee.eulerproject

import lee.eulerproject.problem.getNumber12Answer
import lee.eulerproject.problem.getNumber17Answer
import lee.eulerproject.problem.getNumberLength
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number12Test : Spek({

    describe("12번의 정답을 구한다") {

        given("12번의 정답은") {

            it("21124이다") {
                assertEquals(getNumber12Answer(), 21124)
            }
        }
    }
})