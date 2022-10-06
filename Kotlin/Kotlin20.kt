object GameScore{
    var score: Int =0
    private set

    fun addScore(point: Int){
        if(point>0){
            this.score +=point
        }
    }
}
class Student(val name: String){
    object School{
        const val schoolName = "DP School"
    }
}
fun main(){
    GameScore.addScore(10)
    println("The score is ${GameScore.score}")
    println("The score is ${Student.School.schoolName}")
}