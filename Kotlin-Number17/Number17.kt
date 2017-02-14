package lee.eulerproject.problem

val oneToTenStringLengths = intArrayOf(3, 3, 5, 4, 4, 3, 5, 5, 4, 3)
val elevenToNineteenStringLengths = intArrayOf(6, 6, 8, 8, 7, 7, 9, 8, 8)
val twentyToNinetyStringLengths = intArrayOf(6, 6, 5, 5, 5, 7, 6, 6)
val hundredStringLength = 7
val andStringLength = 3
val thousandStringLength = 8

fun getNumber17Answer(limitValue: Int): Int =
        generateSequence(1) { it + 1 }
                .takeWhile { it <= limitValue }
                .map {
                    if (it < 11) return@map oneToTenStringLengths[it - 1]
                    else if (it < 20) return@map elevenToNineteenStringLengths[it - 11]
                    else if (it < 100) {
                        if (it % 10 == 0)
                            return@map twentyToNinetyStringLengths[(it / 10) - 2]
                        else
                            return@map twentyToNinetyStringLengths[(it / 10) - 2] + oneToTenStringLengths[(it % 10) - 1]
                    } else if (it < 1000) {
                        var numberStringLength = oneToTenStringLengths[it / 100] + hundredStringLength
                        val number = it % 100
                        if (number != 0) {
                            numberStringLength += andStringLength
                            if (number < 11) numberStringLength += oneToTenStringLengths[number - 1]
                            else if (number < 20) numberStringLength += elevenToNineteenStringLengths[number - 11]
                            else if (number < 100) {
                                if (number % 10 == 0)
                                    numberStringLength += twentyToNinetyStringLengths[(number / 10) - 2]
                                else
                                    numberStringLength += twentyToNinetyStringLengths[(number / 10) - 2] + oneToTenStringLengths[(number % 10) - 1]
                            }
                        }
                        return@map numberStringLength
                    } else //if (it == 1000)
                        return@map oneToTenStringLengths[0] + thousandStringLength
                }.sum()


