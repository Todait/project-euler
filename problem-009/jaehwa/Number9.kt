package lee.eulerproject.problem

fun getNumber9Answer(sumValue: Int): Int? {

    val euclidFormulaPair = getEuclidFormulaPair(sumValue) ?: return null

    val m = euclidFormulaPair.first
    val n = euclidFormulaPair.second

    return (m * m - n * n) * 2 * n * m * (m * m + n * n)
}


fun getEuclidFormulaPair(sumValue: Int): Pair<Int, Int>? {

    if (sumValue < 0)
        return null

    for (m in 2..sumValue / 2)
        for (n in 1..m)
            if ((m * (n + m)).toFloat() == sumValue.toFloat() / 2 && m > n) {
                return Pair(m, n)
            }
    return null
}