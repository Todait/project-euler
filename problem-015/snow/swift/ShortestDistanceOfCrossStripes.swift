//
//  ShortestDistanceOfCrossStripes.swift
//  EulerProject
//
//  Created by snow on 2017. 3. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import UIKit

func greatestCommonDivisor(num1: Int, num2: Int) -> Int {
    if num2 == 0 {
        return num1
    }
    return greatestCommonDivisor(num1: num2, num2: num1 % num2)
}

func numberCasesOfCrossStripesRoute(colCount: Int, rowCount: Int) -> Int {
    guard colCount > 0, rowCount > 0 else {
        return 0
    }
    var numberators: [Int] = []
    for i in ((colCount + 1)...(colCount + rowCount)) {
        numberators.append(i)
    }
    
    for denominator in 1...rowCount {
        var divider = denominator
        for (index, numberator) in numberators.enumerated() {
            let greatestCommonDivisorNumber = greatestCommonDivisor(num1: divider, num2: numberator)
            numberators[index] = numberator / greatestCommonDivisorNumber
            divider = divider / greatestCommonDivisorNumber
            if divider == 1 {
                break
            }
        }
    }
    return numberators.reduce(1, *)
}
