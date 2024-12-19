package kw.test.associateBy

fun main() {
    var listOfInt = listOf<Int>(1, 2, 3, 4, 55)
    var associateBy = listOfInt.associateBy {
        it -> it*2
    }

    for (entry in associateBy) {
        println(""+entry.key+ "  "+entry.value)
    }
}