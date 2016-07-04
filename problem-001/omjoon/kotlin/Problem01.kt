
class Problem01 {
    fun answer( max: Int) = {

        var result : Int = 0
        for( i in 0..max)
            when(i){
                i % 3 == 0, i % 5 -> result += max
                else -> print("")
            }

        return result
    }
}
