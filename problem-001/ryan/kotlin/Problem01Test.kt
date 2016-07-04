import org.junit.Test
import kotlin.test.assertEquals

class Problem01Test {
    var problem01: Problem01 = Problem01()

    @Test
    fun testAnswerWithSample() {
        assertEquals(23, problem01.answer(10, arrayOf(3, 5)))
    }

    @Test
    fun testAnswer() {
        assertEquals(233168, problem01.answer(1000, arrayOf(3, 5)))
    }
}
