package lee.eulerproject.problem

import lee.eulerproject.common.getPrimes


fun getNumber5Answer(number: Int): Int =
        getMultipleNumbers(number.getPrimes(), number)
                .reduce { total, next -> total * next }

fun getMultipleNumbers(primeNumbers: List<Int>, limitNumber: Int): List<Int> =
        primeNumbers.map { getCloseSquaerNumber(it, limitNumber) }


fun getCloseSquaerNumber(number: Int, limitNumber: Int): Int {

    if (number > Math.sqrt(limitNumber.toDouble()))
        return number
    else {
        var value = 1
        while (value < limitNumber)
            value *= number
        return value / number
    }
}