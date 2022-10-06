fun printItems(items: MutableList<*>){
    for(i in items.indices){
        print(items.get(i))
    }
}
fun main(){
    val x: MutableList<Any> = mutableListOf(1,2,"a")
    printItems(x)
}