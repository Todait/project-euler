/**
 * Created by Omjoon on 2016. 7. 18..
 */
fun main(args: Array<String>) {
    println(answer(600851475143L))
}
fun answer(max : Long){
    var num = max
    ( 1 .. Math.sqrt(num.toDouble()).toLong()).forEach { if(num % it == 0L){ num /= it; println(it)} }
}
