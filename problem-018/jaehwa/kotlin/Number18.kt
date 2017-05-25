package lee.eulerproject.problem

val array1: Array<Int> = arrayOf(75)
val array2: Array<Int> = arrayOf(95, 64)
val array3: Array<Int> = arrayOf(17, 47, 82)
val array4: Array<Int> = arrayOf(18, 35, 87, 10)
val array5: Array<Int> = arrayOf(20, 4, 82, 47, 65)
val array6: Array<Int> = arrayOf(19, 1, 23, 75, 3, 34)
val array7: Array<Int> = arrayOf(88, 2, 77, 73, 7, 63, 67)
val array8: Array<Int> = arrayOf(99, 65, 4, 28, 6, 16, 70, 92)
val array9: Array<Int> = arrayOf(41, 41, 26, 56, 83, 40, 80, 70, 33)
val array10: Array<Int> = arrayOf(41, 48, 72, 33, 47, 32, 37, 16, 94, 29)
val array11: Array<Int> = arrayOf(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14)
val array12: Array<Int> = arrayOf(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57)
val array13: Array<Int> = arrayOf(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48)
val array14: Array<Int> = arrayOf(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31)
val array15: Array<Int> = arrayOf(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23)

val triangleArray18: Array<Array<Int>> = arrayOf(array1, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15)

fun getMaxSum(bottomA: Int, bottomB: Int, top: Int): Int = if (bottomA >= bottomB) bottomA + top
else bottomB + top

fun mergeArray(bottomArray: Array<Int>, topArray: Array<Int>): Array<Int> {

    val array: MutableList<Int> = mutableListOf()
    for (i in 0..topArray.size - 1) {
        array.add(getMaxSum(bottomArray[i], bottomArray[i + 1], topArray[i]))
    }
    return array.toTypedArray()
}

fun getTriangleSum(triangleArray: Array<Array<Int>>): Int {

    var mergeArray: Array<Int> = triangleArray.last()

    for (i in triangleArray.size - 1 downTo 1) {
        mergeArray = mergeArray(mergeArray, triangleArray[i - 1])
    }
    return mergeArray[0]
}





