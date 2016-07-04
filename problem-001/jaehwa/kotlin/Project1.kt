/**
 * Created by cenacolo12 on 2016. 7. 4..
 */
class Project1 {
    fun getAnswer() : Int {
        return IntRange(1,999)
                .filter { num -> (num % 3 == 0) || (num % 5 == 0)}
                .sum()
    }
}