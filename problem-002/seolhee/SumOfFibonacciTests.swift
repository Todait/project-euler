//
//  SumOfFibonacciTests.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Quick
import Nimble
@testable import EulerProject

class SumOfFibonacciTests: QuickSpec {
    
    override func spec() {
        expect(sumOfFibonacci(to: 4000000)).to(equal(4613732))
    }
    
}
