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

func TestSquare5(t *testing.T) {
	var v int64
	v = sqaure5(1)
	if v != 1 {
		t.Error("v is not  1")
	}

	v = sqaure5(10)
	if v != 100000 {
		t.Error("v is not  100000")
	}
}

func TestBunhae(t *testing.T) {
	var v []int64

	v = bunhae(99)

	if len(v) != 2 {
		t.Error("v len is not  2 ->", v)
	}

	v = bunhae(5165)

	if len(v) != 4 {
		t.Error("v len is not  4 ->", v)
	}

	var a = []int64{5, 6, 1, 5}
	if !reflect.DeepEqual(v, a) {
		t.Error("v len is not  5,6,1,5 ->", v)
	}

	v = bunhae(51659999)

	if len(v) != 8 {
		t.Error("v len is not  4 ->", v)
	}
	var b = []int64{9, 9, 9, 9, 5, 6, 1, 5}
	if !reflect.DeepEqual(v, b) {
		t.Error("v len is not  5,6,1,5 ->", v)
	}

}

func TestJohap(t *testing.T) {
	var o []int64
	var v int64

	o = []int64{1, 2, 3, 4, 5}
	v = johap(o)

	if v != 4425 {
		t.Error("v len is not  4425 ->", v)
	}

	o = []int64{9, 9, 9, 8, 8, 8}
	v = johap(o)

	if v != 275451 {
		t.Error("v len is not  275451 ->", v)
	}
}
