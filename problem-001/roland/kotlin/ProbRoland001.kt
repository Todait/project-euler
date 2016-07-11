fun main(args: Array<String>) {

    val thrhold = 1000

    val seq3 = seq(3).takeWhile { it < thrhold }
    val seq5 = seq(5).takeWhile { it < thrhold }

    val res = (seq3 + seq5).distinct().sorted()

    println( res.reduce { i, j -> i + j } )
//    범준씨 코드 개선
//    var result: Int = 0
//    for (i in 0..999) {
//        when (0) {
//            i % 3, i % 5 -> result += i
//        }
//    }
//    println(result)
}