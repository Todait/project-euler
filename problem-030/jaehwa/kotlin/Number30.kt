package lee.eulerproject.problem

import lee.eulerproject.common.pow

fun getNumber30Answer(): MutableList<Int> {

    var answer: MutableList<Int> = mutableListOf()

    // 2^5 는 32, 3^5 는 243 -> 10의 자리를 넘어버림 -> 조건에 부합하지 않음(10 ~ 100의 자리 계산) -> 6번 계산
    for (a2 in 1..2) {
        for (b2 in 0..2) {
            if (a2.pow(5) + b2.pow(5) == a2 * 10 + b2)
                answer.add(a2 * 10 + b2)
        }
    }

    // 4^5 는 1024 -> 100의 자리를 넘어버림 -> 조건에 부합하지 않음(100 ~ 1000의 자리 계산) -> 100번 계산
    for (a3 in 1..4) {
        for (b3 in 0..4) {
            for (c3 in 0..4) {
                if (a3.pow(5) + b3.pow(5) + c3.pow(5) == a3 * 100 + b3 * 10 + c3)
                    answer.add(a3 * 100 + b3 * 10 + c3)
            }
        }
    }

    // 7^5 는 16807 -> 1000의 자리를 넘어버림 -> 조건에 부합하지 않음(1000~ 10000의 자리 계산) -> 2058번 계산
    for (a4 in 1..6) {
        for (b4 in 0..6) {
            for (c4 in 0..6) {
                for (d4 in 0..6) {
                    if (a4.pow(5) + b4.pow(5) + c4.pow(5) + d4.pow(5) == a4 * 1000 + b4 * 100 + c4 * 10 + d4) {
                        answer.add(a4 * 1000 + b4 * 100 + c4 * 10 + d4)
                    }

                }
            }
        }
    }

    // 10000 ~ 100000 까지의 계산 -> 총 90000 계산 (최적화 실패)
    for (a5 in 1..9) {
        for (b5 in 0..9) {
            for (c5 in 0..9) {
                for (d5 in 0..9) {
                    for (e5 in 0..9) {
                        if (a5.pow(5) + b5.pow(5) + c5.pow(5) + d5.pow(5) + e5.pow(5) == a5 * 10000 + b5 * 1000 + c5 * 100 + d5 * 10 + e5) {
                            answer.add(a5 * 10000 + b5 * 1000 + c5 * 100 + d5 * 10 + e5)
                        }

                    }
                }
            }
        }
    }


    (100000..9.pow(6)).filterTo(answer) { getEqualNumber(it) }

    answer.forEach { println(it) }
    return answer
}

fun getEqualNumber(number: Int): Boolean = number.toString().map { (it - 48).toInt().pow(5) }.sum() == number