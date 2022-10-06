class Sstudent{
    val school:String = "Kendriya Vidyalaya"
    var age:Int = 5
    val isTeenager:Boolean
    get()= age>12
    var name:String? = null
    get()=field?:"Unknown"
    set(value){
        if(value!=null) field=value
    }
}

fun main(){
       //student is an object of class Student
       val student:Sstudent = Sstudent()
       println("1.Studnet is teenager: ${student.isTeenager}")
       student.age = 14
       println("2.Student is teenager: ${student.isTeenager}")
       println("3.Student name is: ${student.name}")
       student.name = "Shiv"
       println("4.Student name is:${student.name}")
}