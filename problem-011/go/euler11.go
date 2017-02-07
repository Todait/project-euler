package main

import "math"

func main() {

	var arrays = getData()
	var max float64 = 0
	var rightAccVal float64 = 0
	var bottomAccVal float64 = 0
	var leftCrossAccVal float64 = 0
	var rightCrossAccVal float64 = 0
	for i := 0; i < 20; i++ {
		for j := 0; j < 20; j++ {

			rightAccVal = 0
			bottomAccVal = 0
			leftCrossAccVal = 0
			rightCrossAccVal = 0

			if j+3 < 20 {
				rightAccVal = acc(arrays[i][j+1], arrays[i][j+1], arrays[i][j+2], arrays[i][j+3])
				bottomAccVal = acc(arrays[j][i], arrays[j+1][i], arrays[j+2][i], arrays[j+3][i])
				if i+3 < 20 {
					leftCrossAccVal = acc(arrays[i][j], arrays[i+1][j+1], arrays[i+2][j+2], arrays[i+3][j+3])
				}
			}
			if j > 3 && i+3 < 20 {
				rightCrossAccVal = acc(arrays[i][j], arrays[i+1][j-1], arrays[i+2][j-2], arrays[i+3][j-3])
			}
			//Todo Max 값 으로 넣기.
			max =
				math.Max(max,
					math.Max(rightAccVal,
						math.Max(bottomAccVal,
							math.Max(leftCrossAccVal, rightCrossAccVal))))
		}
	}
	println(int(max))
}

func acc(a, b, c, d int) float64 {
	if a == 0 || b == 0 || c == 0 || d == 0 {
		return 0
	}
	return float64(a * b * c * d)
}

func getData() []([]int) {

	var array1 = []int{8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8}
	var array2 = []int{49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0}
	var array3 = []int{81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65}
	var array4 = []int{52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91}
	var array5 = []int{22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80}
	var array6 = []int{24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50}
	var array7 = []int{32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70}
	var array8 = []int{67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21}
	var array9 = []int{24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72}
	var array10 = []int{21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95}
	var array11 = []int{78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 4, 62, 16, 14, 9, 53, 56, 92}
	var array12 = []int{16, 3, 9, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57}
	var array13 = []int{86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58}
	var array14 = []int{19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40}
	var array15 = []int{4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66}
	var array16 = []int{88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69}
	var array17 = []int{4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36}
	var array18 = []int{20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16}
	var array19 = []int{20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54}
	var array20 = []int{1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
	var arrays = []([]int){array1, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, array17, array18, array19, array20}
	return arrays
}
