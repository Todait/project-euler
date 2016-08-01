/**
 * Created by cenacolo12 on 2016. 7. 24..
 */
class Project4 {
    fun getAnswer() : Int{
        var value = 0
        for(j in 100..999){
            for(i in 10..90){
                if((j*(i*11)).toString().equals((j*(i*11)).toString().reversed()) && value < (j*(i*11))){
                    value = (j*(i*11))
                }
            }
        }
        return value;
    }
}