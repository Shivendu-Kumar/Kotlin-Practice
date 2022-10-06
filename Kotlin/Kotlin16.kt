open class Persson{
    fun walk(){
        println("Person is Walking")
    }
    fun sleep(){
        println("Person is sleeping")
    }
    open fun talk(){
        println("I am talking")
    }
}
fun main(){
    startTalking(object: Persson(){
        override fun talk(){
            println("I am talking")
        }
    })
}
fun startTalking(person:Persson){
    //code to setup the speaker
    person.talk()
}