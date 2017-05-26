/**
 * Created by Omjoon on 2016. 7. 18..
 */

fun main(args: Array<String>) = answer()

fun answer() = (100..999).mapNotNull(::order).max().run { println(this) }

fun order(number : Int) : Int? = (100..999).reversed().find { (it * number).isPalindrome() }?.let { it * number }

fun Int.isPalindrome() = toString().run { length % 2 == 0 && substring(0,length / 2) == substring(length / 2).reversed() }
