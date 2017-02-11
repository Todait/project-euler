package main

import "testing"

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
