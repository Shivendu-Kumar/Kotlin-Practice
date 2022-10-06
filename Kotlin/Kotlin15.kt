class Child(val name: String){
    inner class SchoolBag(){
        fun printBagOwner(){
            println("The owner of bag is ${name}")
        }

    }
}
fun main(){
    Child("Mark").SchoolBag().printBagOwner()
  
}