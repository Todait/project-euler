//
//  NumberOfPrimeFactors.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

func pow(of num: Int) -> Int { return Int(pow(Double(num), 0.5).rounded()) }

func isPrime(number: Int) -> Bool { return number == 2 ? true : (2..<pow(of: number)).first { return number % $0 == 0 } == nil }

func getMaxPrime(of numberOfPrimeFactors: Int) -> Int? {
    return (2..<numberOfPrimeFactors).reversed().filter { numberOfPrimeFactors % $0 == 0 && isPrime(number: $0) }.first
}
