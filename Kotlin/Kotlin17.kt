data class Studenttt(val name: String, var section: String){
    var age: Int =8
}

fun main(){
    val student = Studenttt("John", "A")
    student.age=10
    val student1= Studenttt("John", "A")

    println("Line1: equals() function: ${student1.equals(student)}")

    println("Line2: toString() function: ${student1.toString()}")

    val student2=student.copy(name="Mark")
    println("Line3: copy() function: ${student2.toString()}")

    val(name, section)=student
    println("Line4: destructuring: $name is in section $section")
}