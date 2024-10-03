fun main () {
//    val animal = "buffalo"

//    when (animal) {
//        "horse" -> println("Animal is horse")
//        "dog" -> println("Animal is dog")
//        "cow" -> println("Animal is cow")
//        else -> println("Animal not found")
//    }

//    when can also be used as expression
    val number = 15
    val result = when(number) {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Number not found"
    }

    println(result)
}