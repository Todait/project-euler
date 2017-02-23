package projecteuler_test

import (
	"testing"

	"todait.com/projecteuler"
)

func TestIndex(t *testing.T) {
	if projecteuler.Index(0, 0, 20) != 0 {
		t.Error("wrong result")
	}
	if projecteuler.Index(1, 0, 20) != 1 {
		t.Error("wrong result")
	}
	if projecteuler.Index(1, 2, 20) != 41 {
		t.Error("wrong result")
	}
	if projecteuler.Index(19, 19, 20) != 399 {
		t.Error("wrong result")
	}
}

// func TestSum(t *testing.T) {
// 	sum := projecteuler.Sum(1, 2, 3, 4)
// 	if sum != 10 {
// 		t.Error("wrong result")
// 	}
// }

func TestMultiple(t *testing.T) {
	sum := projecteuler.Multiple(1, 2, 3, 4)
	if sum != 24 {
		t.Error("wrong result")
	}
}

func TestGetData(t *testing.T) {
	data := projecteuler.GetData(projecteuler.Data, 0, 0, 1, 0)
	if data[0] != 8 || data[1] != 2 || data[2] != 22 || data[3] != 97 {
		t.Error("wrong result")
	}

	data = projecteuler.GetData(projecteuler.Data, 0, 0, 1, 1)
	if data[0] != 8 || data[1] != 49 || data[2] != 31 || data[3] != 23 {
		t.Error("wrong result")
	}

	data = projecteuler.GetData(projecteuler.Data, 0, 0, 0, 1)
	if data[0] != 8 || data[1] != 49 || data[2] != 81 || data[3] != 52 {
		t.Error("wrong result")
	}
}

func TestAnswer(t *testing.T) {
	answer := projecteuler.Answer()
	if answer != 70600674 {
		t.Error("wrong result, answer is 70600674")
	}
}
