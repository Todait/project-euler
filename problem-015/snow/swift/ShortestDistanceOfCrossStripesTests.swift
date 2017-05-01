//
//  ShortestDistanceOfCrossStripesTests.swift
//  EulerProject
//
//  Created by snow on 2017. 3. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class ShortestDistanceOfCrossStripesTests: QuickSpec {
    
    override func spec() {
        context("if num2 is multiple Of num1, it returns num1") {
            it("") {
                expect(greatestCommonDivisor(num1: 1, num2: 0)).to(equal(1))
            }
        }
        context("if num2 is multiple Of num1, it returns num1") {
            it("") {
                expect(greatestCommonDivisor(num1: 5, num2: 10)).to(equal(5))
            }
        }
        context("if num1 and num2 are relatively prime, it returns 1") {
            it("") {
                expect(greatestCommonDivisor(num1: 3, num2: 2)).to(equal(1))
            }
        }
        context("if between num1 and num2 have common factor, it returns common factor") {
            it("") {
                expect(greatestCommonDivisor(num1: 6, num2: 9)).to(equal(3))
            }
        }
        
        context("if colCount or rowCount are less than 0, it returns 0") {
            it("") {
                expect(numberCasesOfCrossStripesRoute(colCount: 0, rowCount: 0)).to(equal(0))
                expect(numberCasesOfCrossStripesRoute(colCount: 1, rowCount: 0)).to(equal(0))
                expect(numberCasesOfCrossStripesRoute(colCount: 0, rowCount: 1)).to(equal(0))
            }
        }
        context("number of cases is (colCount + rowCount)! / (colCount! * rowCount!)") {
            it("") {
                expect(numberCasesOfCrossStripesRoute(colCount: 1, rowCount: 1)).to(equal(2))
                expect(numberCasesOfCrossStripesRoute(colCount: 2, rowCount: 2)).to(equal(6))
                expect(numberCasesOfCrossStripesRoute(colCount: 20, rowCount: 20)).to(equal(137846528820))
            }
        }
    }
    
}
