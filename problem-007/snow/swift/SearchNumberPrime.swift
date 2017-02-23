//
//  SearchNumberPrime.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 23..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

func search(numberPrime: Int) -> Int {
    var count = 0
    var number = 2
    
    while true {
        if number.isPrime {
            count = count + 1
            if count == numberPrime {
                break
            } else {
                number = number + 1
            }
        } else {
            number = number + 1
        }
    }
    return number
}
