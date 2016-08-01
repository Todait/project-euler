/**
 * Created by Omjoon on 2016. 7. 18..
 */
fun main(args: Array<String>) {
    answer()
}
fun answer(){
    var lists : MutableSet<Int> = mutableSetOf()
    ( 100 .. 999).forEach {
        var num = it
        ( 100 .. 999).forEach {
            var result = num * it
            if( result > 10000)
                if(result.toString().substring(0,3) == result.toString().substring(3).reversed())
                     lists.add(result)
        }
    }
    print(lists.sorted().last())
}



fun answer2(){
    generateSequence(100 to 100) {
        it.first to (
                if(it.second == 1000)
                    it.first + 100
                else
                    it.first + 1
                )
        it.second to (
                if(it.first == 1000)
                    it.second + 100
                else
                    it.second + 1
                )
    }.takeWhile { it.first == 999 && it.second == 999 }.filter {
        var result = it.first * it.second
        var front = result.toString().substring(0,3)
        var back = result.toString().substring(3).reversed()
        front == back
    }.forEach { println(it.first * it.second) }
}

fun answer3(){
    generateSequence(100) {it + 1}.takeWhile { it == 999 }.forEach {
        var num = it ;
        (100 .. 999).forEach {
            var result = num * it
            if(result.toString().substring(0,3) == result.toString().substring(3).reversed())
                println(result)
        }
    }
}