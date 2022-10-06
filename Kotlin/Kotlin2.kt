fun main() {
    val age = 24
    val layers = 5
    printcakecandles(age)
    printcaketop(age)
    printcakebottom(age, layers)
}

fun printcaketop(age: Int) {
    repeat(age + 2) { print("=") }
    println()
}

fun printcakecandles(age: Int) {
    print(" ")
    repeat(age) { print(",") }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) { print("|") }
    println()
}

fun printcakebottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) { print("@") }
        println()
    }
}
