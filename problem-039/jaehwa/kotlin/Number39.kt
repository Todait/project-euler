package lee.eulerproject.problem

import lee.eulerproject.common.isNumberOfEachOther
import lee.eulerproject.common.sqrt

fun getAnswer39(p: Int): Int {

    val numbers: MutableList<Int> = mutableListOf()

    for (m in 1..p.sqrt()) {
        for (n in 1..(m - 1)) {

            val seedNumber: Int = m * (m + n) * 2
            if (seedNumber >= p)
                break
            if (isNumberOfEachOther(m, n) && (m + n) % 2 != 0) {
                numbers.addAll(generateSequence(1) { it + 1 }.map { seedNumber * it }.takeWhile { it <= 1000 })
            }
        }
    }

    numbers.sort()

    val pair: MutablePair = MutablePair(0, 0)
    var forCount = 0
    for ((index, number) in numbers.withIndex()) {

        if (index == 0) {
            pair.count = 1
            pair.number = number
            forCount++
        } else {
            if (numbers[index - 1] == number) {
                forCount++
            } else {
                forCount = 0
            }
            if(forCount > pair.count){
                pair.number = number
                pair.count = forCount
            }
        }
    }
    return pair.number
}


class MutablePair(var count: Int = 0, var number: Int = 0)



