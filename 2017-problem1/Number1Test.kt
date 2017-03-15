package lee.tddproject

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.isA
import lee.tddproject.project1.Number1
import org.junit.Test


class Number1Test {

    @Test
    fun testGetAnster() {
        val number1 = Number1()
        assertThat("1번 정답", 233168, isA(equalTo(number1.getAnswer())))
    }

    @Test
    fun testGetMuiltple3_실제_1부터_1000까지의_3의_합인가() {
        val number1 = Number1()
        assertThat("1~1000까지 3의 배수의 합", 166833, isA(equalTo(number1.getmuiltple3())))
    }

    @Test
    fun testGetMuiltple5_실제_1부터_1000까지의_5의_합인가() {
        val number1 = Number1()
        assertThat("1~1000까지 5의 배수의 합", 99500, isA(equalTo(number1.getmuiltple5())))
    }

    @Test
    fun testGetMuiltple15_실제_1부터_1000까지의_15의_합인가() {
        val number1 = Number1()
        assertThat("1~1000까지 15의 배수의 합", 33165, isA(equalTo(number1.getmuiltple15())))
    }
}