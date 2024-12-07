package org.example.kw.ful2

fun add(a:Double,b:Double):Double{
    return a + b
}

fun minus(a:Double,b:Double):Double{
    return a - b
}



fun main() {
    val addCal:(Double,Double)->Double = ::add
    println(addCal(1.0,3.0))

    val minusCal:(Double,Double)->Double=::minus

    var result:(Double,Double)->Double = ::add
    result(3.0,4.0)

    var re = ::add
    re(1.0,4.0)


}

