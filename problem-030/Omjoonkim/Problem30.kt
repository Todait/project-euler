/**
 * Created by Omjoon on 2017. 4. 26..
 */
fun main(args: Array<String>) {
    checkTime({ order().answer() })
}

fun order() = generateSequence(2, { it.plus(1) }).takeWhile { it < 236439 }.filter(::check).sum()

fun check(number: Int) = number == generateSequence(number) { it.div(10)}.takeWhile { it.equals(0).not()}.map { it.rem(10).pow(5) }.sum()