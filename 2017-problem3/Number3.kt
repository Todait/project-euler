package lee.tddproject.project1


fun getNumber3Answer(number: Int): Int? =
        generateSequence(2) { it + 1 }
                .takeWhile { it <= number }
                .filter(::isPrimeNumber)
                .max()

fun isPrimeNumber(number: Int): Boolean =
        generateSequence(2) { it + 1 }
                .takeWhile { (number % it != 0) && (it <= number) }
                .max()?.plus(1) == number