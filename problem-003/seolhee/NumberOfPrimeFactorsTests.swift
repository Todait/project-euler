//
//  NumberOfPrimeFactorsTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class NumberOfPrimeFactorsTests: QuickSpec {
    override func spec() {
        context("fibonacci edge case") {
            it("") {
                expect(1.sqrtInt).to(equal(1))
                expect(2.sqrtInt).to(equal(1))
                expect(3.sqrtInt).to(equal(1))
                expect(4.sqrtInt).to(equal(2))
            }
            it("4 is not prime number") {
                expect(1.isPrime).to(equal(false))
                expect(2.isPrime).to(equal(true))
                expect(3.isPrime).to(equal(true))
                expect(4.isPrime).to(equal(false))
                expect(5.isPrime).to(equal(true))
                expect(201.isPrime).to(equal(false))
            }
            it("prime number havn't prime factors") {
                expect(1.primeFactors).to(equal([]))
                expect(2.primeFactors).to(equal([]))
                expect(5.primeFactors).to(equal([]))
            }
            it("non-prime-number express prime factors") {
                expect(4.primeFactors).to(equal([2]))
                expect(10.primeFactors).to(equal([2, 5]))
                expect(30.primeFactors).to(equal([2, 3, 5]))
                expect(100.primeFactors).to(equal([2, 5]))
            }
            it("") {
                expect(2.maxPrimeFactor).to(beNil())
                expect(10.maxPrimeFactor).to(equal(5))
                expect(13195.maxPrimeFactor).to(equal(29))
                expect(600851475143.maxPrimeFactor).to(equal(6857))
            }
        }
    }
}
