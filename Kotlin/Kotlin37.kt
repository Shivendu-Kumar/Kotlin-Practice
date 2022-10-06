inline fun printName(name:String, fn: (String)-> Unit, noinline fn1:(Int, Int)->Unit){
    fn(name)
    printSum(fn1)
}
fun printSum(fn:(Int, Int)->Unit){
    fn(4,7)
}
fun main(){
    val name: String = "Shiv"
    printName(name, {println(it)}){x:Int,y:Int->println("The sum of number is ${x+y}")}
}