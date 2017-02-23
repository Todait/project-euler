package main

import "testing"

func TestMaxWithHori(t *testing.T) {
	type testpair struct {
		values [][]int
		max    int
	}

	var tests = []testpair{
		{[][]int{{1, 26, 63, 78, 14, 1}, {1, 26, 63, 78, 99, 1}, {1, 26, 63, 78, 14, 1}, {1, 26, 63, 78, 14, 1}}, 12648636},
		{[][]int{{1, 2, 3, 1, 2}, {1, 2, 3, 1, 2}, {3, 3, 3, 1, 2}}, 27},
		{[][]int{{1, 2, 3, 4}}, 24},
	}

	for _, pair := range tests {
		v := maxWithHori(pair.values, 4)
		if v != pair.max {
			t.Error(
				"For", pair.values,
				"expected", pair.max,
				"got", v,
			)
		}
	}
}

func TestMaxWithVert(t *testing.T) {
	type testpair struct {
		values [][]int
		max    int
	}

	var tests = []testpair{
		{[][]int{
			{1, 26, 63, 78, 14, 1},
			{1, 26, 63, 78, 99, 1},
			{1, 26, 63, 78, 14, 1},
			{1, 26, 63, 78, 14, 1}}, 78 * 78 * 78 * 78},
		{[][]int{
			{1, 2, 3, 1, 2},
			{1, 2, 3, 1, 2},
			{3, 3, 3, 1, 2},
			{3, 3, 3, 1, 2}}, 3 * 3 * 3 * 3},
		{[][]int{
			{1, 2, 3, 4},
			{1, 2, 3, 4},
			{1, 2, 3, 4},
			{1, 2, 3, 4}}, 4 * 4 * 4 * 4},
	}

	for _, pair := range tests {
		v := maxWithVert(pair.values, 4)
		if v != pair.max {
			t.Error(
				"For", pair.values,
				"expected", pair.max,
				"got", v,
			)
		}
	}
}

func TestMaxWithDiag(t *testing.T) {
	type testpair struct {
		values [][]int
		max    int
	}

	var tests = []testpair{
		{[][]int{
			{4, 2, 3, 4},
			{1, 4, 3, 2},
			{1, 2, 4, 4},
			{1, 2, 3, 4}}, 4 * 4 * 4 * 4},
		{[][]int{
			{4, 9, 3, 4, 1},
			{1, 4, 9, 4, 1},
			{1, 2, 4, 9, 1},
			{1, 2, 3, 4, 9}}, 81 * 81},
		{[][]int{
			{4, 9, 6, 4, 1, 4},
			{1, 4, 1, 6, 1, 4},
			{1, 2, 4, 1, 6, 4},
			{1, 2, 3, 4, 1, 6}}, 36 * 36},
	}

	var testsFalse = []testpair{
		{[][]int{
			{4, 2, 3, 4},
			{1, 4, 4, 2},
			{1, 4, 4, 4},
			{4, 2, 3, 2}}, 4 * 4 * 4 * 4},
		{[][]int{
			{4, 9, 3, 4, 99},
			{1, 4, 9, 9, 1},
			{1, 2, 9, 9, 1},
			{1, 9, 3, 4, 9}}, 81 * 9 * 99},
		{[][]int{
			{4, 9, 6, 4, 9, 4},
			{1, 4, 1, 9, 1, 4},
			{1, 2, 9, 1, 6, 4},
			{1, 9, 3, 4, 1, 6}}, 9 * 9 * 9 * 9},
	}

	for _, pair := range tests {
		v := maxWithDiag(pair.values, 4, true)
		if v != pair.max {
			t.Error(
				"For", pair.values,
				"expected", pair.max,
				"got", v,
			)
		}
	}

	for _, pair := range testsFalse {
		v := maxWithDiag(pair.values, 4, false)
		if v != pair.max {
			t.Error(
				"For", pair.values,
				"expected", pair.max,
				"got", v,
			)
		}
	}
}

func TestMulti(t *testing.T) {
	type testpair struct {
		values []int
		multi  int
	}

	var tests = []testpair{
		{[]int{26, 63, 78, 14}, 1788696},
		{[]int{1, 2, 3}, 6},
		{[]int{1, 2, 3, 4}, 24},
	}

	for _, pair := range tests {
		v := multi(pair.values)
		if v != pair.multi {
			t.Error(
				"For", pair.values,
				"expected", pair.multi,
				"got", v,
			)
		}
	}
}
