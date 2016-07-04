
class Problem01 {
    fun answer(max: Int, of: Array<Int>) = (1..max - 1).filter { i -> of.any { d -> i % d == 0 } }.sum()
}
