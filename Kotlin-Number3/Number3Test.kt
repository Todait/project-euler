package lee.eulerproject

import lee.eulerproject.problem.getDivisiors
import lee.eulerproject.problem.getNumber3Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals


class Number3Test : Spek({

    describe("3번의 정답을 구한다") {

        given("600851475143이라는 숫자가 있다") {

            val number = 600851475143

            on("해당 수의 소인수 중에서 가장 큰 수는") {

                val value = getNumber3Answer(number)
                it("6857이다") {
                    assertEquals(value, 6857)
                }
            }
        }
    }

    describe("getDivisiors 함수기능") {

        given("600851475143이라는 숫자가 있다") {

            val number = 600851475143

            on("600851475143 의 getDivisiors를 구하면") {

                val value = getDivisiors(number)
                it("모두 0으로 나누어 떨어진다") {
                    assertEquals(0, value.filter { number % it != 0L }.size)
                }
            }
        }

        given("13195이라는 숫자가 있다") {

            val number = 13195L

            on("13195 의 getDivisiors를 구하면") {

                val value = getDivisiors(number)
                it("모두 0으로 나누어 떨어진다") {
                    assertEquals(0, value.filter { number % it != 0L }.size)
                }
            }
        }
    }
})