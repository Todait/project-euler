import java.util.stream.IntStream
import java.util.stream.Stream

/**
 * Created by cenacolo12 on 2016. 7. 17..
 */
class Project3 {
    fun getDivisor(number: Long) : List<Long>{
        return LongRange(2, Math.sqrt(number.toDouble()).toLong())
                .filter { num ->  number % num == 0.toLong() }
    }

    fun getAnswer(number: Long) : Long?{
        return getDivisor(number).filter { num ->
            var judge = true

            for(n in LongRange(2,(num-1).toLong())){
                    if(num % n   == 0.toLong()){
                        judge = false
                    }
            }
            judge}.max();
    }
}