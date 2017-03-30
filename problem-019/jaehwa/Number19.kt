package lee.eulerproject.problem

fun getNumber19Answer(): Int {

    var dayCount = 1
    var answer = 0

    for (i in 1900..2000) {
        val monthDay = getMonthDay(i)
        for (j in 1..12) {
            when (j) {
                1, 3, 5, 7, 8, 10, 12 -> {
                    dayCount += monthDay.second
                    if (dayCount % 7 == 0 && i > 1900) {
                        answer++
                    }

                }
                4, 6, 9, 11 -> {
                    dayCount += monthDay.first
                    if (dayCount % 7 == 0 && i > 1900) {
                        answer++
                    }
                }
                2 -> {
                    dayCount += monthDay.third
                    if (dayCount % 7 == 0 && i > 1900) {
                        answer++
                    }
                }
            }
        }
    }
    return answer
}

fun isLeapYear(year: Int): Boolean = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

fun getMonthDay(year: Int): Triple<Int, Int, Int> = Triple(30, 31, if (isLeapYear(year)) 29 else 28)