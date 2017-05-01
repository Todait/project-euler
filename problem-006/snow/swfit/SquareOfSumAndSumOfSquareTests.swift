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
                expect(1.squareOfSum).to(equal(1))
                expect(2.squareOfSum).to(equal(9))
                expect(3.squareOfSum).to(equal(36))
                expect(10.squareOfSum).to(equal(3025))
                expect(100.squareOfSum).to(equal(25502500))
            }
            it("sum of square until this number") {
                expect(1.sumOfSquare).to(equal(1))
                expect(2.sumOfSquare).to(equal(5))
                expect(3.sumOfSquare).to(equal(14))
                expect(10.sumOfSquare).to(equal(385))
                expect(100.sumOfSquare).to(equal(338350))
            }
            it("difference between square of sum and sum of square") {
                expect(1.differenceBetweenSquareOfSumAndSumOfSquare).to(equal(0))
                expect(2.differenceBetweenSquareOfSumAndSumOfSquare).to(equal(4))
                expect(3.differenceBetweenSquareOfSumAndSumOfSquare).to(equal(22))
                expect(10.differenceBetweenSquareOfSumAndSumOfSquare).to(equal(2640))
                expect(100.differenceBetweenSquareOfSumAndSumOfSquare).to(equal(25164150))
            }
        }
    }
    
}
