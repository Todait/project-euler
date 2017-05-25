package lee.eulerproject.problem

fun getNumber12Answer(): Int {

    var answer = 0

    for (i in 2..10000) {

        val dividedCount = getCountDivided((i * (i + 1)) / 2)
        println( i.toString() + " : " + dividedCount)
        if (dividedCount >= 500) {
            answer = i
            break
        }
    }
    return answer
}

fun getCountDivided(number: Int): Int {

    var count1 = 1
    for (i in 2..number) {
        if (number % i == 0)
            count1++
    }
    return count1
}