import Foundation

(1..<1000).filter({
    
    if $0%3 == 0 || $0%5 == 0 {return true}
    else {return false}
    
}).reduce(0, combine: +)