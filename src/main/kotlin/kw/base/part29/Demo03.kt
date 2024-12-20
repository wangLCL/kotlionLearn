package kw.base.part29

val String.num
    get() = "index" + length

fun main() {
    var x = "x"
    println(x.num)
}