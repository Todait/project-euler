import java.util.stream.Stream

/**
 * Created by cenacolo12 on 2016. 7. 10..
 */
class Project2 {
    fun getAnswer() : Int{
      return Stream.iterate(intArrayOf(1,2)){i -> intArrayOf(i[1], i[0] + i[1])}
                .map { i -> i[0] }
                .filter { i -> (i % 2)==0 }
                .limit(11)
                .reduce { i1, i2 -> i1+i2 }
                .get();
    }
}