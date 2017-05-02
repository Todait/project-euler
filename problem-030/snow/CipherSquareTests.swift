//
//  CipherSquareTests.swift
//  EulerProject
//
//  Created by snow on 2017. 5. 2..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class CipherSquareTests: QuickSpec {
    
    override func spec() {
        context("") {
            it("") {
                expect(5.cipherOfFiveSquare).to(equal(3125))
            }
        }
        context("") {
            it("") {
                expect(4150.cipherOfFiveSquare).to(equal(4150))
            }
        }
        context("") {
            it("") {
                expect(sumOfCipherOfFiveSquare(to: 9 * 9 * 9 * 9 * 9 * 5)).to(equal(443839))
            }
        }
    }
    
}
