package lee.eulerproject.problem

import lee.eulerproject.common.pow

fun getNumber6Answer(number: Int): Int? =
        if (number < 0)
            null
        else
            getSquareOfSum(number)!! - getSumOfSquare(number)!!

fun getSumOfSquare(number: Int): Int? =
        if (number < 0)
            null
        else
            (number * (number + 1) * (2 * number + 1)) / 6

fun getSquareOfSum(number: Int): Int? =
        if (number < 0)
            null
        else
            ((number * (number + 1)) / 2).pow(2)

