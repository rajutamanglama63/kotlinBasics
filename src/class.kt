fun main () {
    val car1 = Car("ranger", "deseal", 10000)
    val car2 = Car("tesla", "electric", 3000)

    println(car1.name)
    println(car1.type)
    println(car1.kmRun)

    println(car1.driveCar())
    println(car1.applyBrakes())

    println(car2.name)
    println(car2.type)
    println(car2.kmRun)

    println(car2.driveCar())
    println(car2.applyBrakes())
}

class Car (val name: String, val type: String, val kmRun: Int) {
    fun driveCar () {
        println("$name car is driving")
    }

    fun applyBrakes () {
        println("Applied Brake")
    }
}