package kw.part3

fun main() {
//    whileUse()
//    dowhile()
//    fordemo()
    rangeUse()
}

fun rangeUse() {
    for (x in 0..5){
        println("${x}")
    }
}

fun fordemo() {
    for (num in 1..9){
        println(num)
    }

    for (x in 1 until 5)
        println(x)

}

fun whenUse(){
    var testScore = 13
    when(testScore){
        in 90..100 -> "x"
        in 10..39 ->"ed"
    }

    if (100 in 0 ..100){
        println(100)
    }
}
private fun dowhile() {
    var i1 = 0
    i1 = 12

    do {
        i1--
        println(i1)
    } while (i1 > 10)
}

private fun whileUse(): Int {
    var i = 10
    while (i > 0) {
        i--
        println(i)
        if (i == 5) break
    }
    return i
}
