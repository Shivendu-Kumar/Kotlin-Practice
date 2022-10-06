package generic

open class Fruit
class Apple: Fruit()

class Box<in T>{
    fun put(item: T){}
    fun get(): T {}
}

fun main(){
    val fruitBox = Box<Fruit>()
    val appleBox: Box<Apple> = fruitBox
    val apple: Apple = appleBox.get()
}