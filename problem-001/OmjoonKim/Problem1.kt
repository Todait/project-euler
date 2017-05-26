fun main(args: Array<String>) {

    val result = IntRange(1,999)
            .filter { num -> (num % 3 == 0) || (num % 5 == 0)}
            .sum()
    println(result)
}
