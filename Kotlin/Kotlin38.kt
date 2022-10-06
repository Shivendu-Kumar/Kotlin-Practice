inline fun printString(crossinline fn:(String)-> Unit){
    fn("Shiv")
    println("Data Printed")

    val task = object:Runnable{
        override fun run()= fn("Mark")
    }
    task.run()
}
fun main(){
    printString{println(it)}
}