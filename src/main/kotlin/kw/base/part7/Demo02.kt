package kw.part7

fun main() {
    var str = "hi,boy,12"
    println(str.substring(0, 2))
    println(str.substring(0 until 4))
    var splitV = str.split(",")
    for (s in splitV) {
        println(s)
    }

    var (b,n,a) = str.split(",")
    println(b+"  "+n+"   "+a)
}