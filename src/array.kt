fun main () {
    val arr0 = arrayOf<String>("Apple", "banana", "Pineapple")
    val arr1: Array<Int> = arrayOf(1, 2, 3, 4)

    for ((i, e) in arr0.withIndex()) {
        println("$i - $e")
    }

    for(i in arr1) {
        println(i)
    }

    println(arr0[0])
    println(arr0.get(2))

    arr0.set(0, "Orange")
    println(arr0[0])

    for ((i, e) in arr0.withIndex()) {
        println("$i - $e")
    }

    println(arr1.size)

}