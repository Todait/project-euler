// 각 자리의 숫자를 4제곱해서 더했을 때 자기 자신이 되는 수는 놀랍게도 단 세 개밖에 없습니다.

// 1634 = 1^4 + 6^4 + 3^4 + 4^4
// 8208 = 8^4 + 2^4 + 0^4 + 8^4
// 9474 = 9^4 + 4^4 + 7^4 + 4^4
// (1 = 1^4의 경우는 엄밀히 말해 합이 아니므로 제외합니다)

// 위의 세 숫자를 모두 더하면 1634 + 8208 + 9474 = 19316 입니다.

// 그렇다면, 각 자리 숫자를 5제곱해서 더했을 때 자기 자신이 되는 수들의 합은 얼마입니까?

package main

import "math"

func main() {
}

func result() int64 {
	var rst, i int64

	for i = 2; i <= 999999; i++ {
		if i == powEach(splitNumber(i), 5) {
			rst += i
		}
	}
	return rst
}

func pow(num int64, many int64) int64 {
	return int64(math.Pow(float64(num), float64(many)))
}

func splitNumber(num int64) []int64 {
	var iNum = num
	var arr []int64
	var i int64

	for i = iNum; i > 0; i /= 10 {
		arr = append(arr, iNum%10)
		iNum = iNum / 10
	}

	return arr
}

func powEach(arr []int64, many int64) int64 {
	var rst int64
	for i := 0; i < len(arr); i++ {
		rst += pow(arr[i], many)
	}

	return rst
}
