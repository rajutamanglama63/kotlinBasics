import kotlin.math.pow

fun main () {
    val func = ::multiply
    val powFunc = ::power

    println(powFunc(5, 8.23))
    println(func(7, 2))
    println(addition(3, 5.0))
    println(addition(3.89f, 5.0))
}

fun addition (a: Int, b: Double): Double {
    return a + b;
}

fun addition (a: Float, b: Double): Double {
    return a + b;
}

fun multiply (x: Int, y: Int): Int {
    return x * y;
}

fun power (a: Int, b: Double): Double {
    return  b.pow(a)
}