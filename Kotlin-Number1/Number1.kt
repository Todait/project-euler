package lee.eulerproject.problem


fun getAnswer(firstNumber: Int, secondNumber: Int, limitNumber: Int): Int {

    val sumOfFirstNumber = generateSequence(firstNumber) { it + firstNumber }.take((limitNumber - 1) / firstNumber).sum()
    val sumOfSecondNumber = generateSequence(secondNumber) { it + secondNumber }.take((limitNumber - 1) / secondNumber).sum()
    val leastCommonMultipleOfFirstAndSecondNumber = getLCM(firstNumber, secondNumber)
    val sumOfleastCommonMultipleOfFirstAndSecondNumber = generateSequence(leastCommonMultipleOfFirstAndSecondNumber) { it + leastCommonMultipleOfFirstAndSecondNumber }.take((limitNumber - 1) / leastCommonMultipleOfFirstAndSecondNumber).sum()
    return sumOfFirstNumber + sumOfSecondNumber - sumOfleastCommonMultipleOfFirstAndSecondNumber
}

fun getGCD(firstNumber: Int, secondNumber: Int): Int =
        if (secondNumber == 0)
            firstNumber
        else
            getGCD(secondNumber, firstNumber % secondNumber)

fun getLCM(firstNumber: Int, secondNumber: Int): Int = (firstNumber * secondNumber) / getGCD(firstNumber, secondNumber)
