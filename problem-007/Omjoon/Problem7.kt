fun main(args: Array<String>){ checkTime{ order().answer() } }

fun order() = generateSequence(2) { it+1 }.filter(Int::isPrime).take(10001).last()

val Int.isPrime get() = (2..sqrt).none{ this % it == 0 }

val Int.sqrt get() = Math.sqrt(toDouble()).toInt()
