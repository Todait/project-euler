fun main(args: Array<String>) {

    val fibo = generateFibo()

    val result = fibo.filter { it.first.and(1) == 0 }
        .takeWhile { it.first < 4000000 }
        .fold( 0 ) { sum, v -> sum + v.first }

    print( result )
}

fun generateFibo() = generateSequence( 1 to 2 ) { it.second to ( it.first + it.second ) }