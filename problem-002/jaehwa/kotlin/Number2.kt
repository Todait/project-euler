package lee.eulerproject.problem

fun getAnswer(limitValue: Int, isEven: Boolean): Int {
    val isEvenFilter: (Int) -> Boolean = { number -> if (isEven) number % 2 == 0 else number % 2 != 0 }
    return generateSequence(1 to 1) { it.second to it.first + it.second }
            .map { it.first }
            .filter(isEvenFilter)
            .takeWhile { it < limitValue }
            .sum()
}
