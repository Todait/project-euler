package main

import (
	"strconv"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"

	"testing"
)

// with ginkgo BDD Framework
func TestProb017(t *testing.T) {
	RegisterFailHandler(Fail)
	RunSpecs(t, "Prob017 Suite")
}

var _ = Describe("Main", func() {
	Describe("#result", func() {
		Context("When answer is given", func() {
			It("is expected to equal OK", func() {
				Expect(result()).To(Equal(21124))
			})
		})
	})

	Describe("type number", func() {
		type testpair struct {
			value  number
			expect string
		}

		SpecTestPair := func(tests []testpair, m func(f number) string) {
			for i := 0; i < len(tests); i++ {
				pair := tests[i]
				Specify("", func() {
					By(strconv.Itoa(int(pair.value)) + " is given")
					Expect(m(pair.value)).To(Equal(pair.expect))
				})
			}
		}

		Describe("#extractTen", func() {
			var tests = []testpair{
				{1, "one"},
				{10, "ten"},
				{11, "eleven"},
				{17, "seventeen"},
				{19, "nineteen"},
				{20, "twenty"},
				{24, "twenty-four"},
				{99, "ninety-nine"},
				{117, "seventeen"},
				{124, "twenty-four"},
				{199, "ninety-nine"},
			}
			SpecTestPair(tests, number.extractTen)
		})

		Describe("#extractHundred", func() {
			var tests = []testpair{
				{200, "two hundred"},
				{117, "one hundred"},
				{124, "one hundred"},
				{199, "one hundred"},
				{429, "four hundred"},
				{910, "nine hundred"},
			}
			SpecTestPair(tests, number.extractHundred)
		})

		// NOTE: 클로저로 인한 후 케이스 실패
		// SpecTestPair := func(tests []testpair, m func(f number) string) {
		// 	for _, pair := range tests {
		// 		Specify("", func() {
		// 			By(strconv.Itoa(int(pair.value)) + " is given")
		// 			Expect(m(pair.value)).To(Equal(pair.expect))
		// 		})
		// 	}
		// }
		//
		// Describe("#extractTen", func() {
		// 	var tests = []testpair{
		// 		{1, "one"},
		// 		{10, "ten"},
		// 		{11, "eleven"},
		// 		{17, "seventeen"},
		// 		{19, "nineteen"},
		// 		{20, "twenty"},
		// 		{24, "twenty-four"},
		// 		{99, "ninety-nine"},
		// 		{117, "seventeen"},
		// 		{124, "twenty-four"},
		// 		{199, "ninety-nine1"},
		// 	}
		// 	SpecTestPair(tests, number.extractTen)
		// })
		//
		// Describe("#extractHundred", func() {
		// 	var tests = []testpair{
		// 		{200, "two hundred"},
		// 		{117, "one hundred"},
		// 		{124, "one hundred"},
		// 		{199, "one hundred"},
		// 		{429, "four hundred"},
		// 		{910, "nine hundred"},
		// 	}
		// 	SpecTestPair(tests, number.extractHundred)
		// })
	})
})

// with testing package
func TestResult(t *testing.T) {
	answer := 21124
	v := result()
	if v != answer {
		t.Error(
			"expected", answer,
			"got", v,
		)
	}
}

func TestExtractTen(t *testing.T) {
	type testpair struct {
		value  number
		expect string
	}

	var tests = []testpair{
		{1, "one"},
		{10, "ten"},
		{11, "eleven"},
		{17, "seventeen"},
		{19, "nineteen"},
		{20, "twenty"},
		{24, "twenty-four"},
		{99, "ninety-nine"},
		{117, "seventeen"},
		{124, "twenty-four"},
		{199, "ninety-nine"},
	}

	for _, pair := range tests {
		v := pair.value.extractTen()
		if v != pair.expect {
			t.Error(
				"For", pair.value,
				"expected", pair.expect,
				"got", v,
			)
		}
	}
}
func TestExtractHundred(t *testing.T) {
	type testpair struct {
		value  number
		expect string
	}

	var tests = []testpair{
		{200, "two hundred"},
		{117, "one hundred"},
		{124, "one hundred"},
		{199, "one hundred"},
		{429, "four hundred"},
		{910, "nine hundred"},
	}

	for _, pair := range tests {
		v := pair.value.extractHundred()
		if v != pair.expect {
			t.Error(
				"For", pair.value,
				"expected", pair.expect,
				"got", v,
			)
		}
	}
}
func TestExtractThousand(t *testing.T) {
	type testpair struct {
		value  number
		expect string
	}

	var tests = []testpair{
		{2000, "two thousand"},
		{1517, "one thousand"},
		{1424, "one thousand"},
		{1399, "one thousand"},
		{4229, "four thousand"},
		{9110, "nine thousand"},
	}

	for _, pair := range tests {
		v := pair.value.extractThousand()
		if v != pair.expect {
			t.Error(
				"For", pair.value,
				"expected", pair.expect,
				"got", v,
			)
		}
	}
}
func TestToString(t *testing.T) {
	type testpair struct {
		value  number
		expect string
	}

	var tests = []testpair{
		{10, "ten"},
		{19, "nineteen"},
		{29, "twenty-nine"},
		{99, "ninety-nine"},
		{129, "one hundred and twenty-nine"},
		{199, "one hundred and ninety-nine"},
		{100, "one hundred"},
		{342, "three hundred and forty-two"},
		{115, "one hundred and fifteen"},
		{1, "one"},
		{1000, "one thousand"},
		{2991, "two thousand nine hundred and ninety-one"},
		{2949, "two thousand nine hundred and forty-nine"},
	}

	for _, pair := range tests {
		v := pair.value.toString()
		if v != pair.expect {
			t.Error(
				"For", pair.value,
				"expected", pair.expect,
				"got", v,
			)
		}
	}
}
func TestCalcLength(t *testing.T) {
	type testpair struct {
		value  string
		expect int
	}

	var tests = []testpair{
		{"one, two, three, four, five", 19},
		{"three hundred and forty-two", 23},
	}

	for _, pair := range tests {
		v := calcLength(pair.value)
		if v != pair.expect {
			t.Error(
				"For", pair.value,
				"expected", pair.expect,
				"got", v,
			)
		}
	}
}
