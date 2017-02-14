package lee.eulerproject.problem

fun getNumber4Answer(): Int {
    var value = 0
    generateSequence(100) { j -> j + 1 }
            .takeWhile { j -> j < 1000 }
            .forEach { j ->
                generateSequence(10) { i -> i + 1 }
                        .takeWhile { i -> i < 91 }
                        .filter { i -> (j * (i * 11)).toString() == (j * (i * 11)).toString().reversed() && value < (j * (i * 11)) }
                        .forEach { i -> value = (j * (i * 11)) }
            }
    return value
}