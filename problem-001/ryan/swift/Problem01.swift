import Foundation

func answer(of: Int..., below: Int) -> Int {
    return (1..<below).filter { i in of.contains { i % $0 == 0 } }.reduce(0, combine: +)
}

print(answer(3, 5, below: 10) == 23)
print(answer(3, 5, below: 1000) == 233168)

