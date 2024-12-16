package kw.base.part20

fun main() {
    var listOfInt:List<Int> = listOf(1, 3, 4, 55)
    for (i in 0 until listOfInt.size) {
        println(listOfInt[i])
    }

    println(listOfInt.getOrElse(6) { "Out index" })

    //包含
    if (listOfInt.contains(3)) {
        println("")
    }

    if (listOfInt.containsAll(listOf(3,3))){

    }

    for (i in listOfInt) {

    }

    listOfInt.forEach{
        println(it)
    }
}