open class Vehicle{
    open fun startEngine(){
        //code to start engine
    }
}
class BMWCar():Vehicle(){
    override fun startEngine(){
        println("BMWCar: starting the engine")
        //super.startEngine()
    }
}
class AudiCar():Vehicle(){
    override fun startEngine(){
        println("AudiCar: starting the engine")
        //super.startEngine()
    }
}
fun main(){
    val bmwCar: Vehicle = BMWCar()
    startCar(bmwCar)

    val audiCar: Vehicle = AudiCar()
    startCar(audiCar)

}
//Polymorphism
fun startCar(car: Vehicle){
     car.startEngine()
}

// fun startBmwCar(car: BMWCar){ 
//     car.startEngine()
// }
// fun startAudiCar(car: AudiCar){
//     car.startEngine()
// }