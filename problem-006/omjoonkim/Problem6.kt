/**
 * Created by Omjoon on 2017. 4. 5..
 */
fun main(args: Array<String>){

    order(100).answer()
}

fun order(max : Int) : Int = (1..max).sum().square - (1..max).sumBy(Int::square)

val Int.square : Int get() = this * this
