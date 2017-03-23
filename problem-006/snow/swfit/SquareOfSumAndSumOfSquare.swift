//
//  SquareOfSumAndSumOfSquare.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

extension Int {
    
    var square: Int {
        return Int(pow(Double(self), Double(2)))
    }
    var sumOfSquare: Int {
        return self * (self + 1) * (2 * self + 1) / 6
    }
    var squareOfSum: Int {
        return (self * (self + 1) / 2).square
    }
    var differenceBetweenSquareOfSumAndSumOfSquare: Int {
        return abs(self.squareOfSum - self.sumOfSquare)
    }
    
}
