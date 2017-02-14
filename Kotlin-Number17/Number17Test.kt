package lee.eulerproject

import lee.eulerproject.problem.getNumber17Answer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals


class Number17Test : Spek({

    describe("17번의 정답을 구한다") {

        given("17번의 정답은") {

            val value = getNumber17Answer(1000)

            it("21124이다") {
                assertEquals(value, 21124)
            }
        }
    }

    describe("특정 숫자까지의 영어 철자 갯수의 합을 구한다") {

        given("10이라는 숫자를 설정한다") {

            val number = 10

            on("10까지 영어 철자 갯수의 합은?") {

                val value = getNumber17Answer(number)
                it("39이다") {
                    assertEquals(value, 39)
                }
            }
        }

        given("99이라는 숫자가 있다") {

            val number = 99

            on("99까지 영어 철자 갯수의 합은?") {

                val value = getNumber17Answer(number)
                it("854이다") {
                    assertEquals(value, 854)
                }
            }
        }

        given("음수일 때") {

            val number = -10

            on("음수개 영어 철자 갯수의 합은?") {
                val value = getNumber17Answer(number)
                it("0과 일치 한다") {
                    assertEquals(value, 0)
                }
            }
        }
    }
})