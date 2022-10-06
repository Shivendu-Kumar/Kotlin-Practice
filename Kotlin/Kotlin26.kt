class ListExample{
fun copy(from: MutableList<out Any>, to: MutableList<Any>){
    for(i in from.indices){
        to.add(from[i])
    }
}
}
fun main(){
    val any: MutableList<Any> = mutableListOf("Shiv", 7)
    val numbers: MutableList<Int> = mutableListOf(1,2,3,4)
    ListExample().copy(numbers, any)
    println(any)
}