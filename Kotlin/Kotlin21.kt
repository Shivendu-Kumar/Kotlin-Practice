class Studeent(val firstName:String, val lastName: String)

fun Studeent.fullName()= "${this.firstName} ${this.lastName}"
fun Int.getEven(): Int{
    if(this % 2==0){
        return this
    } else{
        return this+1
    }
}
fun main(){
    val student=Studeent("Shiv", "Kumar")
    println("The full name of student is: ${student.fullName()}")
    val x: Int =23
    println("The even age is: ${x.getEven()}")
}