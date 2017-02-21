package lee.eulerproject.problem

val andStringLength = 3

val numberStringLengthMap = mapOf(1 to "one".length, 2 to "two".length, 3 to "three".length, 4 to "four".length, 5 to "five".length, 6 to "six".length,
        7 to "seven".length, 8 to "eight".length, 9 to "nine".length, 10 to "ten".length, 11 to "eleven".length, 12 to "twelve".length, 13 to "thirteen".length,
        14 to "fourteen".length, 15 to "fifteen".length, 16 to "sixteen".length, 17 to "seventeen".length, 18 to "eighteen".length, 19 to "nineteen".length,
        20 to "twenty".length, 30 to "thirty".length, 40 to "forty".length, 50 to "fifty".length, 60 to "sixty".length, 70 to "seventy".length, 80 to "eighty".length,
        90 to "ninety".length, 100 to "hundred".length, 1000 to "thousand".length)


fun getNumber17Answer(limitValue: Int): Int =
        generateSequence(1) { it + 1 }
                .takeWhile { it <= limitValue }
                .map(::getNumberLength)
                .sum()


fun getNumberLength(it: Int): Int {
    if (it < 1) return 0
    if (it < 20) return numberStringLengthMap[it]!!
    if (it < 100) return numberStringLengthMap[it - (it % 10)]!! + (numberStringLengthMap[(it % 10)] ?: 0)
    if (it < 1000) {
        val doubleDigit = it % 100
        val hundredStringLength = numberStringLengthMap[it / 100]!! + numberStringLengthMap[100]!!
        if (doubleDigit == 0)
            return hundredStringLength
        else if (doubleDigit < 20)
            return hundredStringLength + andStringLength + numberStringLengthMap[doubleDigit]!!
        else
            return hundredStringLength + andStringLength + numberStringLengthMap[doubleDigit - (doubleDigit % 10)]!! + (numberStringLengthMap[(doubleDigit % 10)] ?: 0)
    } else
        return numberStringLengthMap[it / 1000]!! + numberStringLengthMap[it]!!
}