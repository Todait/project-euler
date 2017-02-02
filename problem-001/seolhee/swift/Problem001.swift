import Foundation
import XCTest

func getSumOfMultiples(from: Int, to: Int) -> Int? {
    guard from < to else {
        return nil
    }
    return (from..<to).filter { $0 % 3 == 0 || $0 % 5 == 0 }.reduce(0, +)
}

XCTAssertEqual(getSumOfMultiples(from: 1, to: 10), 23)
XCTAssertEqual(getSumOfMultiples(from: 1, to: 1000), 233168)
