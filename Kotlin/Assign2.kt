import java.util.Scanner

class ComplexNumber(var real:Int, var img:Int){
    fun add(x: ComplexNumber){
        real+=x.real
        img+=x.img
    }
    fun multiply(x: ComplexNumber){
        var sol = ComplexNumber(x.real * real - x.img * img, x.img * real + x.real * img)
        real = sol.real
        img = sol.img
    }
    fun print(){
        println("$real + i$img")
    }
}
fun main(){
    val read = Scanner(System.`in`)
    val num1Real = read.nextInt()
    val num1Img = read.nextInt()
    val complex1 = ComplexNumber(num1Real, num1Img)

    val num2Real = read.nextInt()
    val num2Img = read.nextInt()
    val complex2 = ComplexNumber(num2Real, num2Img)

    when(read.nextInt()){
        1->{
            complex1.add(complex2)
            complex1.print()
        }
        2->{
            complex1.multiply(complex2)
            complex1.print()
        }
    }
}