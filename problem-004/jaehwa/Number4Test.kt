package lee.eulerproject

import lee.eulerproject.problem.getMaxPalindrome
import lee.eulerproject.problem.getNumber4Answer
import lee.eulerproject.problem.isPalindrome
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number4Test : Spek({

    describe("4번의 정답을 구한다") {

        given("4번의 정답은") {

            it("906609이다") {
                assertEquals(getNumber4Answer(), 906609)
            }
        }
    }

    describe("getMaxPalindrome가 잘 동작하는지?") {

        it("0자리 수들과 곱해서 나온 대칭수는 없디") {
            assertEquals(getMaxPalindrome(0), null)
        }

        it("1자리 수들과 곱해서 나온 대칭수는 9이다") {
            assertEquals(getMaxPalindrome(1), 9)
        }

        it("2자리 수들과 곱해서 나온 대칭수는 9009이다") {
            assertEquals(getMaxPalindrome(2), 9009)
        }

        it("3자리 수들과 곱해서 나온 대칭수는 906609이다") {
            assertEquals(getMaxPalindrome(3), 906609)
        }
    }


    describe("isPalindrome가 잘 동작하는지?") {

        it("906609은 대칭수이다") {
            assertEquals(isPalindrome(906609), true)
        }

        it("13231은 대칭수이다") {
            assertEquals(isPalindrome(13231), true)
        }

        it("1331은 대칭수이다") {
            assertEquals(isPalindrome(1331), true)
        }

        it("11은 대칭수다") {
            assertEquals(isPalindrome(11), true)
        }

        it("43은 대칭수가 아니다") {
            assertEquals(isPalindrome(43), false)
        }

        it("13391은 대칭수가 아니다") {
            assertEquals(isPalindrome(13391), false)
        }
    }
})