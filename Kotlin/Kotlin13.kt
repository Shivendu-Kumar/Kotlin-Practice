abstract class Personn(val name:String){
     abstract fun doWork()
}
class Studentt(name: String, val school: String): Personn(name){
        override fun doWork(){
        println("Student is studying")
    }
}

fun main(){
    val student = Studentt("John", "DP School")
    student.doWork()

}