package lee.eulerproject.problem


fun getNumber5Answer(number: Int): Int =
        getMultipleNumbers(getPrimeNumbers(number), number)
                .reduce { total, next -> total * next }

fun getMultipleNumbers(primeNumbers: List<Int>, limitNumber: Int): List<Int> =
        primeNumbers.map { getCloseSquaerNumber(it, limitNumber) }


fun getPrimeNumbers(limitNumber: Int): List<Int> =
        generateSequence(2) { it + 1 }
                .takeWhile { it <= limitNumber }
                .filter(::isPrimeNumber)
                .toList()

fun isPrimeNumber(number: Int): Boolean =
        if (number <= 1) false
        else generateSequence(2) { it + 1 }
                .takeWhile { it <= Math.sqrt(number.toDouble()) }
                .filter { (number % it) == 0 }
                .toList()
                .isEmpty()

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