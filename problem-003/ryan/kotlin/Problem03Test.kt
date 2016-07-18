import org.junit.Test
import kotlin.test.assertEquals

class Problem03Test {
    var problem03 = Problem03()

    @Test
    fun testAnswer() {
        assertEquals(6857, problem03.answer(600851475143))
    }
}
