// n번째 삼각수는 tn = ½ n (n + 1) 이라는 식으로 구할 수 있는데, 처음 10개는 아래와 같습니다.

// 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

// 어떤 영어 단어에 대해서, 각 철자의 알파벳 순서(A=1, B=2, ..., Z=26)를 모두 더한 값을 '단어값'이라 부르기로 합니다. 예를 들어 'SKY'의 단어값은 19 + 11 + 25 = 55가 되는데, 이것은 우연히도 t10과 같습니다.
// 이렇게 어떤 단어의 단어값이 삼각수일 경우에는 이 단어를 '삼각단어'라 부르기로 합니다.

// 약 16KB의 텍스트 파일 words.txt에는 2000개 정도의 영어 단어가 수록되어 있습니다. 이 중에서 삼각단어는 모두 몇 개입니까?

package main

import (
	"fmt"
	"io/ioutil"
	"strings"
)

func check(e error) {
	if e != nil {
		panic(e)
	}
}

func main() {
	fmt.Println(result())
}

func result() int {
	var stringz = StringzFromFile("./words.txt", ",", "\"")
	var 최대삼각수 = 26 * maxLengthOfStringz(stringz)
	var 삼각수들 = get삼각수들(최대삼각수)

	var cnt int
	var 삼각수들길이 = len(삼각수들)

	for _, str := range stringz {
		// for _, 삼각수 := range 삼각수들 {
		// 	if get단어값(str) == 삼각수 {
		// 		cnt++
		// 		break
		// 	}
		// }
		for i := 삼각수들길이 - 1; i >= 0; i-- {
			var 삼각수 = 삼각수들[i]
			if get단어값(str) == 삼각수 {
				cnt++
				break
			}
		}
	}

	return cnt
}

func get단어값(word string) int {
	var wordBytes = []byte(word)
	var total int

	for _, k := range wordBytes {
		total += int(k) - 64
	}

	return total
}

func get삼각수들(최대삼각수 int) []int {
	var 삼각수들 []int
	var 현재삼각수 int
	var i int

	for i = 1; 현재삼각수 < 최대삼각수; i++ {
		현재삼각수 = int((1 / 2.0) * float32(i) * float32(i+1))
		삼각수들 = append(삼각수들, 현재삼각수)
	}

	return 삼각수들
}

func maxLengthOfStringz(stringz []string) int {
	var maxLen int
	var strLen int

	for _, str := range stringz {
		strLen = len(str)
		if strLen > maxLen {
			maxLen = strLen
		}
	}

	return maxLen
}

// StringzFromFile 입력한 파일명으로 부터 string배열을 구성한다.
func StringzFromFile(filename string, delimeter string, removal string) []string {
	dat, err := ioutil.ReadFile("./words.txt")
	check(err)
	length := len(dat)
	var removedString = strings.Replace(string(dat[0:length]), removal, "", -1)
	return strings.Split(removedString, delimeter)
}
