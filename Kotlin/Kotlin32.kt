fun main() {
    // val name: String = "Shiv"
    val f0: (Int, Int) -> Int = { x, y -> x + y }
    println(f0(4, 6))

    // minimal lambda expression
    val f1 = { 2 }
    println(f1())

    val f2 = { x: Int ->
        println(x)
        x * 2
    }
    println(f2(4))

    // it for single parameter
    val f3: (String) -> Int = { it.length }
    println(f3.invoke("Shiv"))

    performOperatio(8, 2) { x, y -> x + y }
}

fun performOperatio(x: Int, y: Int, fn: (Int, Int) -> Int) {

    val result = fn(x, y)
    println("Result of $x and $y is: $result")
}
