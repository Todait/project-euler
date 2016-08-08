
import java.util.stream.IntStream
import java.util.stream.Stream


/**
 * Created by cenacolo12 on 2016. 8. 8..
 */
class Project5 {

    fun getAnswer() : Int{

        var count = 0;
        var answer = 0;

        for(i in 1..1000000000){

            for(k in 1..20){

                if(i%k==0){
                    count++;
                }
            }

            if(count.equals(20)){
                answer = i;
                break;
            } else {
                count = 0
            }
        }
        return answer;
    }

}