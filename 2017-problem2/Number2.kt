package lee.tddproject.project1

fun getAnswer(limitValue: Int, isEven: Boolean): Int =
        generateSequence(1 to 1) { it.second to it.first + it.second }
                .map { it.first }
                .filter {
                    if (isEven)
                        it % 2 == 0
                    else
                        it % 2 != 0
                }
                .takeWhile { it < limitValue }
                .sum()


// 만약 짝수 조건을 걸지 않는다면?
fun getAnswer(limitValue: Int): Int =
        generateSequence(1 to 1) { it.second to it.first + it.second }
                .map { it.first }
                .filter { it % 2 == 0 }
                .takeWhile { it < limitValue }
                .sum()