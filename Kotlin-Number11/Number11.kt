package lee.eulerproject.problem

val row1: IntArray = intArrayOf(8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8)
val row2: IntArray = intArrayOf(49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0)
val row3: IntArray = intArrayOf(81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65)
val row4: IntArray = intArrayOf(52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91)
val row5: IntArray = intArrayOf(22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80)
val row6: IntArray = intArrayOf(24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50)
val row7: IntArray = intArrayOf(32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70)
val row8: IntArray = intArrayOf(67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21)
val row9: IntArray = intArrayOf(24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72)
val row10: IntArray = intArrayOf(21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95)
val row11: IntArray = intArrayOf(78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92)
val row12: IntArray = intArrayOf(16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57)
val row13: IntArray = intArrayOf(86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58)
val row14: IntArray = intArrayOf(19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40)
val row15: IntArray = intArrayOf(4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66)
val row16: IntArray = intArrayOf(88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69)
val row17: IntArray = intArrayOf(4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36)
val row18: IntArray = intArrayOf(20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16)
val row19: IntArray = intArrayOf(20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54)
val row20: IntArray = intArrayOf(1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48)

val array: Array<IntArray> = arrayOf(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14, row15, row16, row17, row18, row19, row20)


fun getNumber11Answer(): Int {
    return listOf(getHorizontalMaxValue(), getVerticalMaxValue(), getTopRightToBottomLeftMaxValue(), getTopLeftToBottomRightMaxValue()).max() ?: 0
}

// for문으로 짜는 것이 훨신 깔끔함
fun getHorizontalMaxValue(): Int {
    var maxValue = 0
    for (i in 0..16)
        for (j in 0..16) {
            val multpleValue = getMultple(array[i][j], array[i][j + 1], array[i][j + 2], array[i][j + 3])
            if (maxValue < multpleValue)
                maxValue = multpleValue
        }
    return maxValue
}


fun getVerticalMaxValue(): Int {
    var maxValue = 0
    for (i in 0..16)
        for (j in 0..16) {
            val multpleValue = getMultple(array[j][j], array[j + 1][i], array[j + 2][i], array[j + 3][i])
            if (maxValue < multpleValue)
                maxValue = multpleValue
        }
    return maxValue
}

fun getTopRightToBottomLeftMaxValue(): Int {
    var maxValue = 0
    for (i in 0..16)
        for (j in 3..19) {
            val multpleValue = getMultple(array[i][j], array[i + 1][j - 1], array[i + 2][j - 2], array[i + 3][j - 3])
            if (maxValue < multpleValue)
                maxValue = multpleValue
        }
    return maxValue
}

fun getTopLeftToBottomRightMaxValue(): Int {

    var maxValue = 0
    for (i in 0..16)
        for (j in 0..16) {
            val multpleValue = getMultple(array[j][j], array[j + 1][i + 1], array[j + 2][i + 2], array[j + 3][i + 3])
            if (maxValue < multpleValue)
                maxValue = multpleValue
        }
    return maxValue
}

fun getMultple(a: Int, b: Int, c: Int, d: Int): Int =
        if (a == 0 || b == 0 || c == 0 || d == 0)
            0
        else
            a * b * c * d

// Feedback
// 함수명에 Diagonal 빼기 - 0
// 각 함수별로 테스트 케이스 작성 - 0
// 시퀸스 보다는 for문으로 -> 아님 깔끔하게 코드를 줄일 수 있는 방향으로 - 0



