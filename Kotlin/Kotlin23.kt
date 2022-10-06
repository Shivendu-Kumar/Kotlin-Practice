class Printer<T>(){
    fun printContent(content:T){
        println("The content is $content")
    }
    fun printOther(content:T){
        println("The other one is $content ")
    }

}
fun main(){
    val printer = Printer<String>()
    printer.printContent("Hello world")
    val printer1 = Printer<Int>()
    printer1.printContent(12)
    val other = Printer<Double>()
    other.printOther(12.451)
}