package lee.eulerproject.problem


fun getNumber24Answer(): String {

    var numberArray: MutableList<String> = mutableListOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    return getLexicographicOrder(1000000, numberArray)
}

// 시간 복잡도
// 배열의 갯수를 n개라 할 때 -> O(n) 번 걸림
fun getLexicographicOrder(orderNumber: Int, numbers: MutableList<String>): String {

    if (orderNumber <= 0)
        return "0번쨰 순서는 없습니다"

    var caseNumber: Int = getFactorialNumber(numbers.size) ?: 0

    if (orderNumber > caseNumber)
        return "순서가 초과되었습니다"

    if (caseNumber < 0)
        return "배열의 사이즈가 음수입니다"

    var lexicographicOrder: String = ""
    var dividedNumber: Int = orderNumber - 1

    for (i in numbers.size - 1 downTo 1) {

        caseNumber /= i + 1
        val index = (dividedNumber / caseNumber)
        dividedNumber = dividedNumber % caseNumber
        lexicographicOrder += numbers[index]
        numbers.removeAt(index)
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