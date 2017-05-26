fun main(args: Array<String>){
    generateSequence (2,{ it -> it + 1 })
            .takeWhile { mod(it-1)  }
            .last().apply { println(this) }
}

fun mod(num : Int) = (2..20).none{it -> (num % it != 0)}.not()