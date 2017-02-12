package lee.eulerproject

import lee.eulerproject.problem.getAnswer
import lee.eulerproject.problem.getLCM
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class Number1Test : Spek({

    describe("최소 공배수를 구한다") {

        given("두 수가 모두 1이라면") {

            val firstNumber = 1
            val secondNumber = 1

            on("두 수의 최소 공배수를 구할 때") {

                val value = getLCM(firstNumber, secondNumber)
                it("1이 나와야 한다") {
                    assertEquals(value, 1)
                }
            }
        }

        given("두 수가 3,5라면") {

            val firstNumber = 3
            val secondNumber = 5

            on("두 수의 최소 공배수를 구할 때") {

                val value = getLCM(firstNumber, secondNumber)
                it("15가 나와야 한다") {
                    assertEquals(value, 15)
                }
            }
        }
    }

    describe("1번의 정답을 구한다") {

        given("첫번째 수가 3, 두번쨰 수가 5, 제한 숫자가 1000이며") {

            val firstNumber = 3
            val secondNumber = 5
            val limitNumber = 1000

            on("1000미만의 첫번째 수와 두번째 수의 배수를 더하면") {

                val value = getAnswer(firstNumber, secondNumber, limitNumber)
                it("233168이 나와야 한다") {
                    assertEquals(value, 233168)
                }
            }
        }
    }

})
