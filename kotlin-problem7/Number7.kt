package lee.eulerproject.problem


fun getPrimeNumber(number: Int): Int {

    if (number <= 0)
        return 0
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
    else {
        var judge = true
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                judge = false
                break
            }
        }
        return judge
    }
}
