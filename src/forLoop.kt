fun main () {
//    for (i in 1..5 step 2) {
//        println(i)
//    }
//
//    println("until")
//
//    for (i in 1 until 5) {
//        println(i)
//    }
//
//    println("downTo")
//
//    for (i in 10 downTo 1 step 2) {
//        println(i)
//    }

    val number = 7

    for(i in 1..10) {
//        println(number.toString() + " x " + i + " = " + (number * i))

//        string templating
        println("$number x $i = ${number * i}")
    }
}