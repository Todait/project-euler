// 1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
// 각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.
//
// 1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?
//
// 참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
//   예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
//   115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.
//
package main

import (
	"fmt"
	"strings"
)

type number int64

func main() {
	fmt.Println(result())
}

func result() int {
	var result string
	var i number
	for i = 1; i <= 1000; i++ {
		result += i.toString()
	}

	return calcLength(result)
}

func (num number) toString() string {
	var numString string
	if num < 100 {
		numString = num.extractTen()
	} else if num < 1000 {
		toConcat := []string{num.extractHundred(), num.extractTen()}
		if num.extractTen() == "" {
			numString = strings.Join(toConcat, "")
		} else {
			numString = strings.Join(toConcat, " and ")
		}
	} else {
		toConcat := []string{num.extractThousand(), num.extractHundred()}
		numString = strings.Join(toConcat, " ")
		numString = strings.TrimRight(numString, " ")
		if num.extractTen() == "" {
		} else {
			toConcat = []string{numString, num.extractTen()}
			numString = strings.Join(toConcat, " and ")
		}
	}

	return numString
}

func calcLength(str string) int {
	str = strings.Replace(str, "-", "", -1)
	str = strings.Replace(str, " ", "", -1)
	str = strings.Replace(str, ",", "", -1)
	return len(str)
}

func (num number) extractTen() string {
	num = num % 100
	var resultWord string
	if num <= 19 {
		resultWord = num.toSpecialWord()
	} else {
		resultWord = num.toGeneralWord()
	}
	return resultWord
}

// private
func (num number) toSpecialWord() string {
	numStrings := []string{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}
	return numStrings[num]
}

func (num number) toGeneralWord() string {
	numFirst := num % 10
	numTen := num / 10

	numFirstWord := numFirst.toSpecialWord()
	numTenWords := []string{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}

	toConcatStrings := []string{numTenWords[numTen], numFirstWord}

	return strings.TrimRight(strings.Join(toConcatStrings, "-"), "-")
}

func (num number) extractHundred() string {
	numHundred := (num % 1000) / 100

	numHundredWord := numHundred.toSpecialWord()
	var rst string
	if numHundred != 0 {
		toConcatStrings := []string{numHundredWord, " ", "hundred"}
		rst = strings.Join(toConcatStrings, "")
	}

	return rst
}

func (num number) extractThousand() string {
	numThousand := (num % 10000) / 1000

	numThousandWord := numThousand.toSpecialWord()

	toConcatStrings := []string{numThousandWord, " ", "thousand"}

	return strings.Join(toConcatStrings, "")
}
