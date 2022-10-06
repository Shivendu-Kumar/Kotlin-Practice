fun main() {
  val border = "'-._,-'"
  val times_to_repeat = 3
  printBorder(border, times_to_repeat)
  println("Happy Birthday, Shiv!")
  printBorder(border, times_to_repeat)
  
}
fun printBorder(border : String, times_to_repeat : Int){
  repeat(times_to_repeat){
  print(border)
  }
  println()
}