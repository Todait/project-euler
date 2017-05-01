package lee.eulerproject.problem

import java.math.BigInteger


fun getPathCount(grid: Int): BigInteger {

    var value = BigInteger.valueOf(1L)

    for (i in grid + 1L..grid * 2L)
        value *= BigInteger.valueOf(i)

    var value2 = BigInteger.valueOf(1L)

    for (i in 1L..grid)
        value2 *= BigInteger.valueOf(i)


    return value.divide(value2)
}
