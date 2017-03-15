package lee.tddproject

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.isA
import lee.tddproject.project1.getAnswer
import org.junit.Test


class Number1Test {

    @Test
    fun testGetAnster() {

        assertThat("1번 정답", 233168, isA(equalTo(getAnswer(3, 5, 1000))))

    }
}