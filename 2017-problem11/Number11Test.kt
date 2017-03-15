package lee.tddproject

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.isA
import lee.tddproject.project1.getAnswer
import org.junit.Test


class Number11Test {

    @Test
    fun testGetAnswer() {
        assertThat("11번의 정답은", 70600674, isA(equalTo(getAnswer())))
    }
}