fun outsideFunction(){
    println("This is an outside function")
}

var outsideProperty:String ="outside"

class Teacher{
   private var onLeave = false
   protected var parkingSlot = 1
   internal val school = "DP School"

   val name = "John"
   fun isAvailable() = !onLeave
}

fun main(){
    println(outsideFunction())
    val teacher = Teacher()
    println("Teacher is on leave: ${teacher.onLeave}") //Cannot access as private in Teacher 
    println("Teacher has parking slot: ${teacher.parkingSlot}")//Cannot access as protected in Teacher
    println("The school is: ${teacher.school}")
    println("Teacher's name is: ${teacher.name}")
    println("Teacher is available: ${teacher.isAvailable()}")
}