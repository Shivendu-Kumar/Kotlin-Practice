fun main(){
    //Map immutable
    val classRanks = mapOf(1 to "Ram", 2 to "Sita", 3 to "Laxman")
    println("1. Students: ${classRanks.values}")
    println("2. Ranks: ${classRanks.keys}")
    println("3. Laxman has got a rank ${classRanks.containsValue("Laxman")}")
    println("4. There is a 4th rank ${classRanks.containsKey(4)}")
    println("5. Student at rank 1 is ${classRanks.get(1)}")

}