package main

import (
	"reflect"
	"testing"
)

// func TestResult(t *testing.T) {
// 	var v = result()
// 	if v != 443839 {
// 		t.Error("v is not 443839, ", v)
// 	}
// }

func TestIsPandigital(t *testing.T) {
	var num int
	var rst, exp bool

	num = 192384576

	rst = isPandigital(num)
	exp = true
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

	num = 918273645

	rst = isPandigital(num)
	exp = true
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

	num = 1234567890

	rst = isPandigital(num)
	exp = false
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

	num = 123456788

	rst = isPandigital(num)
	exp = false
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

}

func TestNumToSlice(t *testing.T) {
	var num int
	var exp, rst []int

	num = 128345

	rst = numToSlice(num)
	exp = []int{1, 2, 8, 3, 4, 5}
	if !reflect.DeepEqual(rst, exp) {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

}

func TestContinuePaste(t *testing.T) {
	var rst, num, exp int
	var arr []int

	num = 192

	arr = []int{1, 2, 3}
	rst = continuePaste(num, arr)
	exp = 192384576
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

}
func TestIntegerConcat(t *testing.T) {
	var rst, exp, num1, num2 int

	num1 = 192
	num2 = 168123

	rst = integerConcat(num1, num2)
	exp = 192168123
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

	num1 = 1231289
	num2 = 12381283

	rst = integerConcat(num1, num2)
	exp = 123128912381283
	if rst != exp {
		t.Error("Expect: ", exp, "| Result: ", rst)
	}

}
