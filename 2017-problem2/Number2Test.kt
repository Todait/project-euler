package lee.tddproject

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.isA
import lee.tddproject.project1.getAnswer
import org.junit.Test

class Number2Test {

    // 주의 : TestCase는 디폴트 생성자가 꼭 필요하다!

    @Test
    fun testGetAnswer_4백만_이하면서_짝수일_떄() {
        assertThat("2번의 정답은", 4613732, isA(equalTo(getAnswer(4000000, true))))
    }
}


