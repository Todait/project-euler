package lee.tddproject.project1


class Number1 {

    fun getAnswer(): Int {
        return getmuiltple3() + getmuiltple5() - getmuiltple15()
    }

    fun getmuiltple3(): Int =
            generateSequence(3) { it + 3 }.take((1000 - 1) / 3).sum()

    fun getmuiltple5(): Int =
            generateSequence(5) { it + 5 }.take((1000 - 1) / 5).sum()

    fun getmuiltple15(): Int =
            generateSequence(15) { it + 15 }.take((1000 - 1) / 15).sum()

}