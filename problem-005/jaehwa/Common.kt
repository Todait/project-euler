package lee.eulerproject.common


fun Int.getPrimes(): List<Int> {

    if (this < 2) return emptyList()

    val primes: MutableMap<Int, Boolean> = mutableMapOf()

    for (i in 2..this)
        primes[i] = true

    for (i in 2..this)
        if (primes[i]!!) {
            for (j in (i * 2)..this step i)
                primes[j] = false
        }

    return primes.filter { it.value }.map { it.key }
}

fun Int.pow(exponentiation: Int): Int = Math.pow(this.toDouble(), exponentiation.toDouble()).toInt()

fun Int.getFactorialNumber(number: Int): Int? {

    if (number == 0)
        return 1
    else if (number < 0)
        return null
    else
        return getFactorialNumber(number - 1)!! * number
}