fun main(args: Array<String>) {

    val n = 600851475143L

    var max = 0L

    PrimeSequence().forEach { it ->

        if (it * it > n) {
            print( max )
            return
        }

        if (n % it == 0L)
            max = if ( max > it ) max else it
    }
}

class PrimeSequence() : Sequence<Long> {

    override fun iterator(): Iterator<Long> = object : Iterator<Long> {

        private var count = 1L
        private var nextItem = 1L
        private val primes = mutableSetOf(2L, 3L)

        private fun calcNext(): Boolean {

            count += 2L

            for (e in primes) {

                if (count % e == 0L)
                    return false
            }

            return true
        }

        override fun next(): Long {

            if (nextItem < 2L) {
                count = 2L
                nextItem = 2L
            } else if (nextItem == 2L) {
                count = 3L
                nextItem = 3L
            } else {

                while (!calcNext()) { /* do nothing */
                }
                primes.add(count)
                nextItem = count
            }

            return nextItem
        }

        override fun hasNext() = true
    }
}

/* 문제 2번 */

fun prob2() = generateFibo().filter { it.first.and(1) == 0 }
        .takeWhile { it.first < 4000000 }
        .fold(0) { sum, v -> sum + v.first }

fun generateFibo() = generateSequence(1 to 2) { it.second to (it.first + it.second) }