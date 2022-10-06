fun parseMovieName(name:String):Int{
    return name.toInt()
}
fun main(){
   // val name:String ="300"
    val name:String = "Titanic"
    val x = parseMovieName(name)
    println(x)
}