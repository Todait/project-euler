package lee.eulerproject.problem


fun getPrimeNumber(number: Int): Int? {

    if (number <= 0)
        return null
    if (number == 1)
        return 2
    else {
        var index = 1
        var startNumber = 2
        while (index < number) {
            startNumber++
            if (isPrimeNumberUsingForLoop(startNumber)) {
                index++
            }
        }
        return startNumber
    }
}

fun isPrimeNumberUsingForLoop(number: Int): Boolean {

    if (number <= 1)
        return false
    else
        return (2..Math.sqrt(number.toDouble()).toInt()).all { number % it != 0 }
}

// 코드 컨밴션 -> 다 띄울꺼면 띄우고. 통일을 해라