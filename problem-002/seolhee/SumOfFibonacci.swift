//
//  SumOfFibonacci.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

func getFibonacci(to: Int) -> [Int] {
    var fibonacci: [Int] = [1, 2]
    var first = 1
    var second = 2
    
    while second < to {
        let third = second + first
        first = second
        second = third
        if second < to {
            fibonacci.append(second)
        }
    }
    return fibonacci
}

func sumOfFibonacci(to: Int) -> Int { return getFibonacci(to: to).filter { $0 % 2 == 0 }.reduce(0, +) }
