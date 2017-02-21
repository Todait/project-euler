//
//  SumOfSnailMatrixDiagonal.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 21..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

struct SnailMatrix {
    
    var matrix: [[Int]]
    var length: Int
    
    init(length: Int) {
        self.length = length
        matrix = [[Int]](repeating: [Int](repeating: 0, count: length), count: length)
        setUp()
    }
    
    mutating private func setUp() {
        var row = length / 2
        var column = length / 2
        var number = 2
        matrix[row][column] = 1
        
        for i in 1..<length {
            if i % 2 == 1 {
                for _ in 0..<i {
                    column = column + 1
                    matrix[row][column] = number
                    number = number + 1
                }
                for _ in 0..<i {
                    row = row + 1
                    matrix[row][column] = number
                    number = number + 1
                }
            } else {
                for _ in 0..<i {
                    column = column - 1
                    matrix[row][column] = number
                    number = number + 1
                }
                for _ in 0..<i {
                    row = row - 1
                    matrix[row][column] = number
                    number = number + 1
                }
            }
            
            if row == 0 {
                for _ in 0..<length - 1 {
                    column = column + 1
                    matrix[row][column] = number
                    number = number + 1
                }
            }
        }
        
    }
    var draw: String {
        var string = ""
        for i in 0..<length {
            string = string + String(describing: matrix[i]) + "\n"
        }
        return string
    }
    var sumOfDiagonalValue: Int {
        var sum = 1
        var start = 1
        var interval = 1
        for i in 0..<(length / 2) {
            start = start + 2 + (8 * i)
            interval = 2 * (i + 1)
            sum = sum + (4 * start) + (6 * interval)
        }
        return sum
    }
}
