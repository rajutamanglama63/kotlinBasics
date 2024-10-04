fun main () {
   val addResult = addNumbers(5, 2.130f)
//    println("result: " + result)
    println("addResult: $addResult")

    val subResult = subtractNumbers(45, 23)
    println("subResult: $subResult")



    evenOrOdd(24)
    evenOrOdd(55)

    printMessage(4)
    printMessage() //default argument
}


fun addNumbers (num1: Int, num2: Float): Float {
    return num1 + num2
}

fun subtractNumbers (num1: Int, num2: Int): Int = num1 - num2

fun evenOrOdd (num1: Int) {
    if(num1 % 2 == 0) println("even") else println("odd")
}

fun printMessage (count: Int = 2) {
    for (i in 1..count) {
        println("Hello $i")
    }
}