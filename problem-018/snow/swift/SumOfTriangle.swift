//
//  File.swift
//  EulerProject
//
//  Created by snow on 2017. 3. 9..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

struct Triangle {
    
    let triangle: [[Int]]
    
    init(triangle: [[Int]]) {
        self.triangle = triangle
    }
    
    var maxSum: Int {
        guard self.triangle.isEmpty else {
            return 0
        }
        var triangle = self.triangle
        let row = triangle.count - 1
        
        for i in 0..<row {
            let col = triangle[row - i].count - 1
            for j in 0..<col {
                triangle[row - i - 1][j] += max(triangle[row - i][j], triangle[row - i][j + 1])
            }
        }
        return triangle[0][0]
    }
    
}
