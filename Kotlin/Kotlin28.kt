inline fun<reified T> checkTypeAtRuntime(item: Any){
    println("${item is T}")
}
fun main(){
    val names: MutableList<String> = mutableListOf("John", "Sarah", "Shiv")
    val ages: MutableList <Int> = mutableListOf(1,2,3)

    checkTypeAtRuntime<String> ("John")
    checkTypeAtRuntime<Int> ("Sarah")
}
