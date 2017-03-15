package lee.eulerproject.problem


fun getNumber3Answer(number: Long): Long = getPrimeFactors(number).max() ?: 0

fun getPrimeFactors(input: Long): MutableSet<Long> {
    val primeFactors = mutableSetOf<Long>()
    var number = input
    var primeFactor = 2L
    while (number > 1) {
        if (number % primeFactor == 0L) {
            primeFactors.add(primeFactor)
            number /= primeFactor
        } else
            primeFactor++
    }
    return primeFactors
}


// feedback
// 다시 짜기