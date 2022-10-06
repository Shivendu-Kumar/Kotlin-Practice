fun parseMovieNames(name:String):Int{
    return name.toInt()
}

fun main(){
    val movieNames = "300"
    //val movieNames = "Titanic"
    try{
        val x = parseMovieNames(movieNames)
        println(x)
    }catch(ex: NumberFormatException){
        println("Exception happened because name was not numeric ${ex.message}")}
    catch(ex: Exception){
        println("Exception happened ${ex.message}")
    }
    finally{
        println("Finally block")
    }
}