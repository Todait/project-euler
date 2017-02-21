//
//  NumberOfPrimeFactors.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

extension Int {
    
    var isPrime: Bool { return self < 4 ? self > 1 : !(2...self.sqrtInt).contains { self % $0 == 0 } }
    var sqrtInt: Int { return Int(sqrt(Double(self))) }
    var primeFactors: [Int] {
        if self < 4 || self.isPrime {
            return []
        }
        
        var primeFactors: Set<Int> = []
        for number in 2...self.sqrtInt {
            if self % number == 0 {
                if number.isPrime {
                    primeFactors.insert(number)
                }
                if (self / number).isPrime {
                    primeFactors.insert(self / number)
                }
            }
        }
        return primeFactors.sorted()
    }
    var maxPrimeFactor: Int? { return self.primeFactors.max() }
    
}
