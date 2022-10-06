// fun main(){
//     //val f0: (Int)->Unit
//     val printSum: Int.(Int)-> Unit={println("The sum of $this and $it is ${plus(it)}")}
//     val x: Int = 6
//     x.printSum(4)

//     val printSum1:Int.(Int)-> Unit=fun Int.(num:Int): Unit=println("The sum of $this"+"and $num is ${plus(num)}")
//     val y: Int=6
//     y.printSum1(4)
// }
fun main(){
    val printdiff: Int.(Int)->Unit={println("The diff between $this and $it is ${minus(it)}")}
    val x: Int =6
    x.printdiff(4)

    val printdiff1: Int.(Int)->Unit=fun Int.(num: Int):Unit=println("The diff between $this and $num is ${minus(num)}")
    val y: Int =6
    y.printdiff1(4)
}