package lee.eulerproject

import lee.eulerproject.problem.getAnswer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class Number2Test : Spek({

    describe("2번의 정답을 구한다") {

        given("제한 숫자가 4백만 이하이고, 피보나치수의 짝수만 뽑아서") {

            val isEven = true
            val limitNumber = 4000000

            on("해당 피보나치수를 더하면") {

                val value = getAnswer(limitNumber, isEven)
                it("4613732이 나와야 한다") {
                    assertEquals(value, 4613732)
                }
            }
        }

        given("제한 숫자가 50 이하이고, 피보나치수의 홀수만 뽑아서") {

            val isEven = false
            val limitNumber = 50

            on("해당 피보나치수를 더하면") {

                val value = getAnswer(limitNumber, isEven)
                it("44가 나와야 한다") {
                    assertEquals(value, 44)
                }
            }
        }
    }
})