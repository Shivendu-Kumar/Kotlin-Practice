fun main() {
    // Map mutable
    val classRanks = mutableMapOf(1 to "Ram", 2 to "Sita", 3 to "Laxman")
    classRanks.put(4, "Hanuman")
    classRanks.remove(2)
    println(classRanks)
}
