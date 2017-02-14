package lee.eulerproject.problem


fun getNumber3Answer(number: Long): Long? =
        getDivisiors(number).filter { num ->
            var judge = true
            for (n in LongRange(2, Math.sqrt(num.toDouble()).toLong())) {
                if (num % n == 0.toLong()) {
                    judge = false
                    if (!judge) break
                }
            }
            judge
        }.max()


fun getDivisiors(number: Long): List<Long> =
        LongRange(2, Math.sqrt(number.toDouble()).toLong()).filter { number % it == 0L }