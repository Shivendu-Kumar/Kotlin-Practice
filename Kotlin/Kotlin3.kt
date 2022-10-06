fun main(){
 //Non Mutabel list
 val names = listOf("Shiv", "Krishna","Ankesh","Ankit")
 println("1. The size of list is : ${names.size}")
 println("2. The second item in the list is: ${names.get(1)}")
 println("3. The second item in the list using index operator is : ${names[1]}")
 println("4. Ankesh is at index ${names.indexOf("Ankesh")} in the list")

}