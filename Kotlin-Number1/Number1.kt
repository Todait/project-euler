package lee.eulerproject.problem


fun getNumber1Answer(firstNumber: Int, secondNumber: Int, limitNumber: Int): Int {

    val sumOfFirstNumber = generateSequence(firstNumber) { it + firstNumber }.take((limitNumber - 1) / firstNumber).sum()
    val sumOfSecondNumber = generateSequence(secondNumber) { it + secondNumber }.take((limitNumber - 1) / secondNumber).sum()
    val lcmOfFirstAndSecondNumber = getLCM(firstNumber, secondNumber)
    val sumOfLcmOfFirstAndSecondNumber = generateSequence(lcmOfFirstAndSecondNumber) { it + lcmOfFirstAndSecondNumber }.take((limitNumber - 1) / lcmOfFirstAndSecondNumber).sum()
    return sumOfFirstNumber + sumOfSecondNumber - sumOfLcmOfFirstAndSecondNumber
}

fun getGCD(firstNumber: Int, secondNumber: Int): Int =
        if (firstNumber < 0 || secondNumber < 0)
            -1
        else if (secondNumber == 0)
            firstNumber
        else
            getGCD(secondNumber, firstNumber % secondNumber)

fun getLCM(firstNumber: Int, secondNumber: Int): Int =
        if (firstNumber < 0 || secondNumber < 0)
            -1
        else
            (firstNumber * secondNumber) / getGCD(firstNumber, secondNumber)


// feedback
// getGCD 에 대한 테스트 케이스가 없음
// 변수 이름 다시 짜서, 다시 테스트 해보기