//
//  EvenFibonacciTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class EvenFibonacciTests: QuickSpec {
    override func spec() {
        context("fibonacci edge case") {
            it("Until 1, fibonacci of value is 1") {
                expect(fibonacci(until: 1)).to(equal([1]))
                expect(fibonacci(until: 2)).to(equal([1, 2]))
                expect(fibonacci(until: 3)).to(equal([1, 2, 3]))
            }
        }
        context("fibonacci ok case") {
            it("") {
                expect(fibonacci(until: 10)).to(equal([1, 2, 3, 5, 8]))
                expect(fibonacci(until: 100)).to(equal([1, 2, 3, 5, 8, 13, 21, 34, 55, 89]))
            }
        }
        context("sum of even fibonacci edge case") {
            it("even Fibonacci sum is even number") {
                expect(sumOfEvenFibonacci(until: 1)).to(equal(0))
                expect(sumOfEvenFibonacci(until: 2)).to(equal(2))
                expect(sumOfEvenFibonacci(until: 3)).to(equal(2))
            }
        }
        context("sum of even fibonacci ok case") {
            it("even Fibonacci sum is even number") {
                expect(sumOfEvenFibonacci(until: 10)).to(equal(10))
                expect(sumOfEvenFibonacci(until: 4000000)).to(equal(4613732))
            }
        }
    }
}
