package lee.eulerproject.problem

fun getAnswer31(): Int {

    var max: Int = 0

    for (i in 9123..9876) {

        if (isPandigi(i * 1, i * 2)) {
            val n = getNumber(i * 1, i * 2)
            max <= n
            max = n
        }
    }
    return max
}

fun isPandigi(a: Int, b: Int): Boolean {

    val numString: String = a.toString() + b.toString()

    if (numString.contains("0"))
        return false


    for (i in 1..9) {
        if (numString.filter { it.toInt() - 48 == i }.length >= 2)
            return false
    }
    return true
}

fun getNumber(a: Int, b: Int): Int = (a.toString() + b.toString()).toInt()
