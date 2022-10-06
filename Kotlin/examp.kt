// fun printMe(s:String):Unit{
//     print(s)
// }
// fun higherfunc(str:String,myfunc:(String)->Unit){
//     myfunc(str)
// }
// fun main(){
//     higherfunc("Anyone can Code!",::printMe)
// }
// fun myFunction():()->Unit{
//     var a=1+(-3)
//     var lambda = {print(a);a=a/5}
//     return lambda
// }
// fun main(){
//     var mylambda= myFunction()
//     mylambda()
//     mylambda()
// }
inline fun performOp(number:Int, noinline fn:(Int)-> Unit){
  doOp(fn)    
}
fun doOp(fn:(Int)->String){
    fn(2)
}
fun main(){
    performOp(3,{println("New Number")})
}