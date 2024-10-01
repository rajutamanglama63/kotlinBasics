fun main () {
    val number = 6

    val result1 = number in 1..6 //this include 6

    val result2 = number in 1 until 6 //this exclude 6

    println(result1)
    println(result2)
}