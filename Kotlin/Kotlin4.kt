fun main(){
    //Mutable list
    val names = mutableListOf("Shiv","Krishna","Ankesh","Nikhil")
    names.add("Ankit")
    println(names)
    names.removeAt(1)
    names.remove("Shiv")
    println(names)
    names.set(0, "Shivendu")
    names[1] = "Kant"
    println(names)
    names.clear()
    println(names)
}