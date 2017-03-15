package lee.tddproject.project1


fun getAnswer(firstNumber: Int, secondNumber: Int, limitNumber: Int): Int {

    val sumOfFirstNumber = generateSequence(firstNumber) { it + firstNumber }.take((limitNumber - 1) / firstNumber).sum()
    val sumOfSecondNumber = generateSequence(secondNumber) { it + secondNumber }.take((limitNumber - 1) / secondNumber).sum()
    val leastCommonMultipleOfFirstAndSecondNumber = getLeastCommonMultiple(firstNumber, secondNumber)
    val sumOfleastCommonMultipleOfFirstAndSecondNumber = generateSequence(leastCommonMultipleOfFirstAndSecondNumber) { it + leastCommonMultipleOfFirstAndSecondNumber }.take((limitNumber - 1) / leastCommonMultipleOfFirstAndSecondNumber).sum()
    return sumOfFirstNumber + sumOfSecondNumber - sumOfleastCommonMultipleOfFirstAndSecondNumber
}

fun getLeastCommonMultiple(firstNumber: Int, secondNumber: Int): Int =
        if (firstNumber % secondNumber == 0)
            secondNumber
        else
            getLeastCommonMultiple(secondNumber, getLeastCommonMultiple(firstNumber, secondNumber))
