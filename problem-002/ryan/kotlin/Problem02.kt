
class Problem02 {
    fun answer() = generateSequence(0 to 1) { it.second to it.first + it.second }
            .takeWhile { it.first < 4000000 }
            .filter { it.first % 2 == 0 }
            .sumBy { it.first }
}
