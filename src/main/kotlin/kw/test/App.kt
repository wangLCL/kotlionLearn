package kw.test

import org.example.kw.ful2.add

fun main() {
//    add(1.0,2.0)
    val ed = (arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray())
    for (item in ed){
        println(item)
    }

    val p = People(10).apply {
        eat()
    }

    /**
     * with可以直接调用方法
     */
    with(p){
        eat()
    }

}