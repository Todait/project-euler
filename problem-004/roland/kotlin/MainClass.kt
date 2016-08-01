import utils.*

fun main(args: Array<String>) {

    /* 세자리 수 곱에 의한 결과물은 ( 9 * 10 * 10 ) ^ 2 개 => 최대 810000 번 연산 */

    /* 연산횟수 줄이기 */
    /* 1) 100 * 100 <= xyz * abc < 1000 * 1000 */
    /* 2) y = x(n-x) 그래프의 최대값은 x = n/2 일 때이다. */
    /* 3) a * b = b * a 이다. */

    /* 1000 * 1000
        999 * 1000 ->
        999 * 999 -> 998 * 1000 ->
        998 * 999 -> 997 * 1000 ->
        998 * 998 -> 997 * 999 -> 996 * 1000
        -> ..

        100 < x < y < 1000, 200 < m < 2000 을 만족하는 x, y, m
        x + y = m, x = m / 2 의 내림값 부터, ( x, y ) 쌍에 대해 palindrome 체크를 순차적으로 수행한다.
     */

    val max_sum = 2000
    val min_sum = 200

    var x = 0
    var y = 0

//  forEach 안에서는 x + y = m, x = ( m / 2 의 올림값 ), y = ( m - x ) 를 generate
    loop@ for ( n in max_sum downTo min_sum ) {

        x = n / 2
        y = n - x

        while ( y <= max_sum / 2 ) {

            if ( isPalindrome( x * y ) )
                break@loop

            x -= 1
            y += 1
        }
    }

    print( " x = $x, y = $y, result = ${ x * y }")
}

/* 문제 3번 */
fun prob3() {

    val n = 600851475143L

    var max = 0L

    PrimeSequence().forEach { it ->

        if (it * it > n) {
            print( max )
            return
        }

        if (n % it == 0L)
            max = if ( max > it ) max else it
    }
}

/* 문제 2번 */
fun prob2() = generateFibo().filter { it.first.and(1) == 0 }
        .takeWhile { it.first < 4000000 }
        .fold(0) { sum, v -> sum + v.first }