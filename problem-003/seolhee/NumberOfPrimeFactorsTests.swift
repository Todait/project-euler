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
        expect(getMaxPrime(of: 10)).to(equal(5))
        expect(getMaxPrime(of: 13195)).to(equal(29))
        expect(getMaxPrime(of: 600851475143)).to(equal(6857))
    }
    
}
