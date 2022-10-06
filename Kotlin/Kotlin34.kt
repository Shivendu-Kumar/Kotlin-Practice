fun performOperationss(x: Int, y:Int, fn:(Int, Int)->Int){
 val result = fn(x,y)
 println("Result of $x and $y is: $result")
}
fun main(){
    //has explicit return type
    //the "return" works normally
   val f0: (Int, Int)->Int = fun(x: Int, y:Int):Int = x+y
   performOperationss(4, 8, f0)

   //passed always inside the parameter
   performOperationss(7, 2, fun(x,y)= x-y)
}
