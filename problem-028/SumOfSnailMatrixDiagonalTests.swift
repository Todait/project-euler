//
//  SumOfSnailMatrixDiagonalTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class SumOfSnailMatrixDiagonalTests: QuickSpec {
    
    override func spec() {
        context("edge case") {
            it("") {
                let snailMatrixDiagonal = SnailMatrix(length: 1)
                expect(snailMatrixDiagonal.sumOfDiagonalValue).to(equal(1))
            }
            it("") {
                let snailMatrixDiagonal = SnailMatrix(length: 3)
                expect(snailMatrixDiagonal.sumOfDiagonalValue).to(equal(25))
            }
        }
        context("ok case") {
            it("") {
                let snailMatrixDiagonal = SnailMatrix(length: 5)
                expect(snailMatrixDiagonal.sumOfDiagonalValue).to(equal(101))
            }
            it("") {
                let snailMatrixDiagonal = SnailMatrix(length: 1001)
                expect(snailMatrixDiagonal.sumOfDiagonalValue).to(equal(669171001))
            }
            
        }
    }
    
}
