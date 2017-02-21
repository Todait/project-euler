//
//  EvenFibonacci.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

func fibonacci(until maxNumber: Int) -> [Int] {
    if maxNumber == 1 {
        return [1]
    } else if maxNumber <= 0 {
        return [0]
    }
    
    var fibonacci: [Int] = [1, 2]
    var index = fibonacci.count - 1
    
    while fibonacci[index] + fibonacci[index-1] <= maxNumber {
        fibonacci.append(fibonacci[index] + fibonacci[index-1])
        index = index + 1
    }
    return fibonacci
}

func sumOfEvenFibonacci(until maxNumber: Int) -> Int {
    return fibonacci(until: maxNumber).filter { $0 % 2 == 0 }.reduce(0, +)
}
