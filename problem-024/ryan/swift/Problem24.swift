
/*
 어떤 대상을 순서에 따라 배열한 것을 순열이라고 합니다. 예를 들어 3124는 숫자 1, 2, 3, 4로 만들 수 있는 순열 중 하나입니다.
 이렇게 만들 수 있는 모든 순열을 숫자나 문자 순으로 늘어놓은 것을 사전식(lexicographic) 순서라고 합니다.
 0, 1, 2로 만들 수 있는 사전식 순열은 다음과 같습니다.
 
 012   021   102   120   201   210
 
 0, 1, 2, 3, 4, 5, 6, 7, 8, 9로 만들 수 있는 사전식 순열에서 1,000,000번째는 무엇입니까?
 */

import Foundation

// MARK: - Int.factorial

extension Int {
    var factorial: Int {
        guard 0 < self else {
            return 1
        }
        return (1...self).reduce(1, *)
    }
}

enum Problem24Error: Error {
    case noSymbol
    case indexOutOfRange
}

// MARK: - func find(at index: Int, with symbols: [String]) -> String

func find(at index: Int, with sortedSymbols: [String]) throws -> String {
    guard 0 < sortedSymbols.count else {
        throw Problem24Error.noSymbol
    }
    guard 0 < index && index <= sortedSymbols.count.factorial else {
        throw Problem24Error.indexOutOfRange
    }
    guard 1 < sortedSymbols.count else {
        return sortedSymbols[0]
    }
    let numberOfCase = (sortedSymbols.count - 1).factorial
    let selectedIndex = (index - 1) / numberOfCase
    
    var sortedSymbols = sortedSymbols
    let selectedSymbol = sortedSymbols.remove(at: selectedIndex)
    let nextIndex = index - selectedIndex * numberOfCase
    
    return selectedSymbol + (try find(at: nextIndex, with: sortedSymbols))
}

// MARK: - Test

do {
    let answer = try find(at: 1_000_000, with: (0...9).map { "\($0)" })
    print("2783915460" == answer)
} catch {
    print(false)
}
