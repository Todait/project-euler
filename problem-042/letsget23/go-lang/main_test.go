package main

import "testing"

func TestResult(t *testing.T) {
	var v = result()
	if v != 162 {
		t.Error("v is not 162, ", v)
	}
}
