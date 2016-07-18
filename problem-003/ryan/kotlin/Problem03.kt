
class Problem03 {

    fun sqrt(num: Long) = Math.sqrt(num.toDouble()).toLong()

    fun isPrime(num: Long) = if (1L == num) false else (2..sqrt(num)).none { 0L == num % it }

    fun divider(n: Long) = (2L..n).first { it -> 0L == n % it }

    fun answer(num: Long) = generateSequence(num, { it / divider(it) }).first { isPrime(it) }

}
