/**
 * Created by cenacolo12 on 2016. 7. 2..
 */
fun main(args: Array<String>) {
    println(IntRange(1,999).filter { num -> (num % 3 == 0) || (num % 5 == 0)}.sum())
}