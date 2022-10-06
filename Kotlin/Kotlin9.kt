class student(val firstName:String="Mark"){
   var lastName:String?=null

   init{
    println("init block called")
   }
   constructor(firstName:String, lastName:String):this(firstName){
    println("Secondary constructor called")
    this.lastName=lastName
   }
}
fun main(){
    //Primary Constructor Called
   // val Student:student=student("Shivendu")
    //Secondary Constructor Called
    val Student:student=student("Shivendu","Kumar") 
    println("Name of student is: ${Student.firstName} ${Student.lastName}")
}