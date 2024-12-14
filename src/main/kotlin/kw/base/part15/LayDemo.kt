package kw.base.part15

import kw.base.part15.LayDemo as LayDemo1

class LayDemo {
    val age:Int by lazy {
        10
    }
}

fun main() {
    var ld = LayDemo1()
    println(ld.age)
}