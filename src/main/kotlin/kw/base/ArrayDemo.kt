package kw.base

fun main() {
    val intArray1 = arrayOf(21,32,45)
    for (i in intArray1) {
        println(i)
    }

    var value = arrayOfNulls <Int> (4)
    value[0] = 19

    var data3 = Array<Int>(10){i->i*7}
    var data4 = Array<Int?>(10){i->i*7}


    for (i in data3) {
        println(i)
    }
}