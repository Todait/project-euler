package main

fun main(args: Array<String>) {
     println(answer(600851475143))
}

fun answer(max : Long) =
    generateSequence(max,{ it.run { this / (2L..this).first { 0L == this % it } }} )
            .first(Long::isPrime)

fun Long.sqrt() = Math.sqrt(toDouble()).toLong()

fun Long.isPrime() = if (1L == this) false else (2..sqrt()).none { 0L == this % it }

