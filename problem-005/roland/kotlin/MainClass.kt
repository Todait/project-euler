import utils.PrimeSequence

fun main(args: Array<String>) {

    val n = 20

    print(PrimeSequence().takeWhile { it < n }.map {

        var x = it

        while (x * it < n)
            x *= it

        return@map x
    }.reduce { i, j -> i * j })
}