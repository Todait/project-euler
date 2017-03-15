package lee.tddproject

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.isA
import lee.tddproject.project1.getNumber3Answer
import lee.tddproject.project1.isPrimeNumber
import org.junit.Test


class Number3Test {

    @Test
    fun testGetNumber3Answer() {

        assertThat("600851475143의 가장 큰 수", 6857, isA(equalTo(getNumber3Answer(6857))))
    }

    @Test
    fun testIsPrimeNumber_5는_소수인가() {

        assertThat("5는 소수다", true, isA(equalTo(isPrimeNumber(5))))
    }

    @Test
    fun testIsPrimeNumber_29는_소수인가() {

        assertThat("29는 소수다", true, isA(equalTo(isPrimeNumber(29))))
    }

    @Test
    fun testIsPrimeNumber_1117는_소수인가() {

        assertThat("1117는 소수다", true, isA(equalTo(isPrimeNumber(1117))))
    }

    @Test
    fun testIsPrimeNumber_941는_소수인가() {

        assertThat("941는 소수다", true, isA(equalTo(isPrimeNumber(941))))
    }

    @Test
    fun testIsPrimeNumber_2423는_소수인가() {

        assertThat("2423는 소수다", true, isA(equalTo(isPrimeNumber(2423))))
    }
}