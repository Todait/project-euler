package main

import (
	"reflect"
	"testing"
)

func TestResult(t *testing.T) {
	var v = result()
	if v != 443839 {
		t.Error("v is not 443839, ", v)
	}
}

func TestResultByNumber(t *testing.T) {
	var v = resultByNumber()
	if v != 443839 {
		t.Error("v is not 443839, ", v)
	}
}

func TestPow(t *testing.T) {
	var v int64
	v = pow(1, 5)
	if v != 1 {
		t.Error("v is not  1")
	}

	v = pow(10, 5)
	if v != 100000 {
		t.Error("v is not  100000")
	}
}

func TestSplitNumber(t *testing.T) {
	var v []int64

	v = splitNumber(99)

	if len(v) != 2 {
		t.Error("v len is not  2 ->", v)
	}

	v = splitNumber(5165)

	if len(v) != 4 {
		t.Error("v len is not  4 ->", v)
	}

	var a = []int64{5, 6, 1, 5}
	if !reflect.DeepEqual(v, a) {
		t.Error("v len is not  5,6,1,5 ->", v)
	}

	v = splitNumber(51659999)

	if len(v) != 8 {
		t.Error("v len is not  4 ->", v)
	}
	var b = []int64{9, 9, 9, 9, 5, 6, 1, 5}
	if !reflect.DeepEqual(v, b) {
		t.Error("v len is not  5,6,1,5 ->", v)
	}
}

func TestPowEach(t *testing.T) {
	var o []int64
	var v int64

	o = []int64{1, 2, 3, 4, 5}
	v = powEach(o, 5)

	if v != 4425 {
		t.Error("v len is not  4425 ->", v)
	}

	o = []int64{9, 9, 9, 8, 8, 8}
	v = powEach(o, 5)
	if v != 275451 {
		t.Error("v len is not  275451 ->", v)
	}

	var oo Number
	var vv Number
	oo = Number(999888)
	vv = oo.powEach(5)
	if v != 275451 {
		t.Error("v len is not  275451 ->", vv)
	}
}
