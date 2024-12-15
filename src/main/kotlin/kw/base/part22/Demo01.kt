package kw.base.part22

import java.lang.Exception

fun main() {
    try {
        val v = 2/0;
        println(v)
    }catch (e:Exception){
        e.printStackTrace()
    }
    println("end ")
}