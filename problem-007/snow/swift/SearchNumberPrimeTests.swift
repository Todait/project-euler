//
//  SearchNumberPrimeTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 23..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class SearchNumberPrimeTests: QuickSpec {
    
    override func spec() {
        context("ok case") {
            it("") {
                expect(search(numberPrime: 11)).to(equal(31))
            }
            it("") {
                expect(search(numberPrime: 10001)).to(equal(104743))
            }
            
        }
    }
    
}
