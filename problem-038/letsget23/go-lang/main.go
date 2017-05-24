// 숫자 192에 1, 2, 3을 각각 곱합니다.

// 192 × 1 = 192
// 192 × 2 = 384
// 192 × 3 = 576
// 곱한 결과를 모두 이어보면 192384576 이고, 이것은 1 ~ 9 팬디지털(pandigital)인 숫자입니다. 이런 과정을 편의상 '곱해서 이어붙이기'라고 부르기로 합니다.

// 같은 식으로 9와 (1, 2, 3, 4, 5)를 곱해서 이어붙이면 918273645 라는 1 ~ 9 팬디지털 숫자를 얻습니다.

// 어떤 정수와 (1, 2, ... , n)을 곱해서 이어붙였을 때 얻을 수 있는 가장 큰 아홉자리의 1 ~ 9 팬디지털 숫자는 무엇입니까? (단 n > 1)

package main

import "fmt"

func main() {
	fmt.Println(continuePaste(2, []int{1, 2, 3}))
}

func numToSlice(num int) []int {
	var slicedNum []int

	for num > 0 {
		slicedNum = append(slicedNum, num%10)
		num /= 10
	}

	return reverse(slicedNum)
}

func reverse(numbers []int) []int {
	for i := 0; i < len(numbers)/2; i++ {
		j := len(numbers) - i - 1
		numbers[i], numbers[j] = numbers[j], numbers[i]
	}
	return numbers
}

func isPandigital(num int) bool {
	var cor = []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	var as = numToSlice(num)
	var cnt int

	for i, v := range cor {
		for _, v2 := range as {
			if v == v2 {
				cor[i] = 99
				cnt++
				break
			}
		}
	}

	if cnt == 10 {
		return true
	}
	return false
}

func continuePaste(num int, arr []int) int {
	var total int

	for _, v := range arr {
		total = integerConcat(total, num*v)
	}

	return total
}

func integerConcat(leftNum int, RightNum int) int {
	var divNum int

	for divNum = 1; ; divNum *= 10 {
		if RightNum/divNum == 0 {
			break
		}
	}

	return (leftNum * divNum) + RightNum
}
