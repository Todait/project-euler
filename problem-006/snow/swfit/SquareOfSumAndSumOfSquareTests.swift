//
//  SquareOfSumAndSumOfSquareTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class SquareOfSumAndSumOfSquareTests: QuickSpec {
    
    override func spec() {
        context("ok case") {
            it("square of sum until this number") {
                expect(1.까지_합의_제곱).to(equal(1))
                expect(2.까지_합의_제곱).to(equal(9))
                expect(3.까지_합의_제곱).to(equal(36))
                expect(10.까지_합의_제곱).to(equal(3025))
                expect(100.까지_합의_제곱).to(equal(25502500))
            }
            it("sum of square until this number") {
                expect(1.까지_제곱의_합).to(equal(1))
                expect(2.까지_제곱의_합).to(equal(5))
                expect(3.까지_제곱의_합).to(equal(14))
                expect(10.까지_제곱의_합).to(equal(385))
                expect(100.까지_제곱의_합).to(equal(338350))
            }
            it("difference between square of sum and sum of square") {
                expect(1.까지_합의_제곱_과_제곱의_합_차이).to(equal(0))
                expect(2.까지_합의_제곱_과_제곱의_합_차이).to(equal(4))
                expect(3.까지_합의_제곱_과_제곱의_합_차이).to(equal(22))
                expect(10.까지_합의_제곱_과_제곱의_합_차이).to(equal(2640))
                expect(100.까지_합의_제곱_과_제곱의_합_차이).to(equal(25164150))
            }
        }
    }
    
}
