//
//  SquareOfSumAndSumOfSquare.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

extension Int {
    
    var 까지_제곱의_합: Int {
        return self * (self + 1) * (2 * self + 1) / 6
    }
    var 까지_합의_제곱: Int {
        return Int(pow((Double(self * (self + 1) / 2)), Double(2)))
    }
    var 까지_합의_제곱_과_제곱의_합_차이: Int {
        return self.까지_합의_제곱 - self.까지_제곱의_합
    }
    
}
