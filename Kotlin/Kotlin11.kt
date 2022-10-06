open class Peerson(val name:String){
    init{
        println("This is a person")
    }
    var age: Int = 1
    fun doWork(){
        println("Person is doing work")
    }
}

class Sttudent(name:String, val school:String):Peerson(name){
    init{
        println("This is a student")
    }
}

fun main(){
    val student = Sttudent( "Shiv",  "DPS")
    student.doWork()
    println("The age of student is ${student.age}")
}