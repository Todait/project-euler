package lee.eulerproject.problem

import lee.eulerproject.common.pow

fun getNumber4Answer(): Int = getMaxPalindrome(3)!!

fun getMaxPalindrome(exponentiationNumber: Int): Int? {

    if (exponentiationNumber <= 0)
        return null

    val maxNumber = 10.pow(exponentiationNumber) - 1
    val minNumber = 10.pow(exponentiationNumber - 1)

    for (i in maxNumber * 2 downTo minNumber * 2) {

        var rightNumber = 0
        var leftNumber = 0

        if (i % 2 == 0) {
            rightNumber = i / 2
            leftNumber = i / 2
        } else {
            rightNumber = i / 2 + 1
            leftNumber = i / 2
        }

        while (rightNumber <= maxNumber && leftNumber >= minNumber) {
            val value = rightNumber * leftNumber
            if (isPalindrome(value))
                return value
            rightNumber += 1
            leftNumber -= 1
        }
    }
    return null
}

fun isPalindrome(number: Int): Boolean = number.toString() == number.toString().reversed()