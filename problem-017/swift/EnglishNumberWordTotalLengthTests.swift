//
//  EnglishNumberWordTotalLengthTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 14..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class EnglishNumberWordTotalLengthTests: QuickSpec {
    
    override func spec() {
        //Defines an example
        it("units digit word of 15 is 'five'") {
            expect(5.unitsDigitWord).to(equal("five"))
            expect(15.unitsDigitWord).to(equal("five"))
            expect(0.unitsDigitWord).to(equal(""))
            expect(123.unitsDigitWord).to(equal("three"))
            expect(130309.unitsDigitWord).to(equal("nine"))
        }
        it("tenth digit word of 195 is 'ninety'") {
            expect(195.tenthDigitWord).to(equal("ninety"))
            expect(0.tenthDigitWord).to(equal(""))
            expect(10.tenthDigitWord).to(equal(""))
            expect(1233.tenthDigitWord).to(equal("thirty"))
            expect(130399.tenthDigitWord).to(equal("ninety"))
        }
        it("19 that is a teen numer is 'nineteen'") {
            expect(19.teenWord).to(equal("nineteen"))
            expect(0.teenWord).to(equal(""))
            expect(10.teenWord).to(equal("ten"))
            expect(1233.teenWord).to(equal(""))
            expect(130399.teenWord).to(equal(""))
        }
        it(" 115 is one hundred and fifteen") {
            expect(115.english).to(equal("onehundredandfifteen"))
            expect(342.english).to(equal("threehundredandfortytwo"))
            expect(10.english).to(equal("ten"))
        }
        it("english number word total length of 1~5 is 19") {
            expect(englishNumberWordTotalLength(from: 1, to: 5)).to(equal(19))
            expect(englishNumberWordTotalLength(from: 1, to: 1000)).to(equal(21124))
            expect(englishNumberWordTotalLength(from: 0, to: 0)).to(equal(0))
            expect(englishNumberWordTotalLength(from: 4, to: 5)).to(equal(8))
        }
    }
    
}
