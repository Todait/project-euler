package lee.eulerproject.problem


fun getNumber6Answer(number: Int): Int = getSquareOfSum(number) - getSumOfSquare(number)

fun getSumOfSquare(number: Int): Int {
    var value = 0
    for (i in 1..number)
        value += (i * i)
    return value
}

fun getSquareOfSum(number: Int): Int {

    var value = 0
    for (i in 1..number)
        value += i
    return value * value
}


