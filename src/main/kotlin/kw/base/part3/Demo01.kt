package org.example.kw.part3

fun main() {
    val score = 100
    var grade = if (score < 60){
        println("D")
    }else if (score <70){
        println("C")
    } else {
      //必须有这个  牛逼
        println("傻逼形式!")
    }
    println(grade)   //kotlin.Unit

    val end = if (score<40){
        "D"
    }else if (score<70){
        "C"
    }else{
        "B"
    }
    println(end) //B
}