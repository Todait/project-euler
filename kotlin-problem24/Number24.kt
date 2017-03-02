package lee.eulerproject.problem


fun getNumber24Answer(): String {

    var numberArray: MutableList<String> = mutableListOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    return getLexicographicOrder(1000000, numberArray)
}

fun getLexicographicOrder(orderNumber: Int, numbers: MutableList<String>): String {

    if (orderNumber <= 0)
        return "0번쨰 순서는 없습니다"

    if (orderNumber > getFactorialNumber(numbers.size) ?: 0)
        return "순서가 초과되었습니다"

    var lexicographicOrder: String = ""
    var dividedNumber: Int = orderNumber - 1

    for (i in numbers.size - 1 downTo 1) {

        getFactorialNumber(i)?.let {
            val index = (dividedNumber / it)
            dividedNumber = dividedNumber % it
            lexicographicOrder += numbers[index]
            numbers.removeAt(index)
        }
    }
    lexicographicOrder += numbers[0]
    return lexicographicOrder
}

fun getFactorialNumber(number: Int): Int? {

    if (number == 0)
        return 1
    else if (number < 0)
        return null
    else {
        var value = 1
        for (i in 1..number) {
            value *= i
        }
        return value
    }
}