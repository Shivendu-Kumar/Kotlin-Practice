open class mammal
class sloth: mammal()
class bear: mammal()
class zoo<out T>{
    fun get():T{TODO()}
}
fun main(){
    val cage = zoo<sloth>()
    val Cage:zoo<bear>= cage
}