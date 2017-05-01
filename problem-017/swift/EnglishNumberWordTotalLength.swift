//
//  EnglishNumberWordTotalLength.swift
//  EulerProject
//
//  Created by snow on 2017. 2. 14..
//  Copyright © 2017년 seolheelee. All rights reserved.
//

import Foundation

extension String {
    
    var length: Int { return self.characters.count }
    
}

extension Int {
    
    var unitsDigitWord: String {
        let unitsDigit = ["", "one" , "two", "three", "four", "five", "six", "seven", "eight", "nine"]
        return self > 0 ? unitsDigit[self % 10] : unitsDigit[self]
    }
    var tenthDigitWord: String {
        let tenthDigit = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
        return tenthDigit[self % 100 / 10]
    }
    var teenWord: String {
        let teen = ["ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
        return self >= 10 && self <= 19 ? teen[self % 10] : ""
    }
    var english: String {
        let hundred = "hundred"
        let thousand = "onethousand"
        let and = "and"
        
        var english = ""
        let a = self / 100
        let b = self % 100
        
        if a > 0 {
            if a >= 10 {
                english.append(thousand)
            }
            if a % 10 > 0 {
                english.append(a.unitsDigitWord + hundred)
            }
            if b > 0 {
                english.append(and)
            }
        }
        if b > 0 {
            switch b {
            case 1...9, 20...99: english.append(b.tenthDigitWord + b.unitsDigitWord)
            case 10...19: english.append(b.teenWord)
            default: ()
            }
        }
        return english
    }
    
}

func englishNumberWordTotalLength(from start: Int, to end: Int) -> Int {
    return (start...end).map { $0.english }.reduce("", +).length
}
