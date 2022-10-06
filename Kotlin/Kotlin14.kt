interface Footballer{
    val position: String
    fun dribble()
    fun kick(){
        println("Kick the football")
    }
}
open class Persoon(val name: String)

class Studennt(name:String, override val position: String):Persoon(name), Footballer{
    override fun dribble(){
        println("Dribble the ball")
    }
}
fun playFootball(footballer: Footballer){
    footballer.dribble()
    footballer.kick()
}
fun printName(person: Persoon){
  println("Person name is: ${person.name}")
}
fun printPosition(position: Studennt){
    println("Person position is: ${position.position}")
}
fun main(){
    val student = Studennt("John", "Striker")
    playFootball(student)
    printName(student)
    printPosition(student)
}