//
//  CipherSquare.swift
//  EulerProject
//
//  Created by snow on 2017. 5. 2..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

func sumOfCipherOfFiveSquare(to maxNumer: Int) -> Int {
    guard maxNumer < 2 else {
        return 0
    }
    return (2...maxNumer).reduce(0) { sum, value in
        if value == value.cipherOfFiveSquare {
            return sum + value
        }
        return sum
    }
}

extension Int {
    
    var cipherOfFiveSquare: Int {
        var sum = 0
        var value = self
        while value > 0 {
            let cipher = value % 10
            sum += cipher.fivePow
            value = value / 10
        }
        return sum
    }
    var fivePow: Int { return Int(pow(Double(self), Double(5))) }
    
}
