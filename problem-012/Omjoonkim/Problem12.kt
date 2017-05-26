fun main(args: Array<String>) {
    checkTime({
        println(answer(1))
    })
}

tailrec fun answer(number: Int): Int = if (number.triangleNumber.divisorsCount < 500) answer(number + 1) else number.triangleNumber

val Int.triangleNumber: Int get() = (1..this).sum()

tailrec fun Int.pow(number: Int, option: Int = this): Int =
        if (number == 0)
            1
        else if (number == 1)
            this
        else
            (this * option).pow(number - 1, option)

val Int.divisorsCount: Int
    get() =
    if (this == 1)
        1
    else
        let { value ->
            generateSequence(2, { it + 1 })
                    .mapNotNull {
                        val divisorCount = value.countOfDivisorByNumber(it)
                        if (divisorCount != 0)
                            value /= it.pow(divisorCount)
                        return@mapNotNull if (divisorCount == 0 && value != 1) null else divisorCount + 1
                    }
                    .takeWhile { !(value == 1 && it == 1) }
                    .reduce { result, countOfDivisorByNumber -> result * countOfDivisorByNumber }
        }

tailrec fun Int.countOfDivisorByNumber(num: Int, count: Int = 0): Int =
        if (num == 0)
            count
        else
            if (this % num == 0)
                (this / num).countOfDivisorByNumber(num, count + 1)
            else
                count