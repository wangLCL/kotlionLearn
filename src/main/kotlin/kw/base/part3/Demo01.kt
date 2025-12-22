package org.example.kw.part3

fun main() {

    var age = 10
    if (age>10){
        println("学生")
    }else{
        println("小屁孩")
    }


    if (age>20){
        println("大于20")
    }else if (age>60){
        println("大于60")
    }else{
        println("小于20")
    }

    val useTime = 100
    var stGrade = if(useTime>10){
        "A"
    }else{
        //必须有else
        "B"
    }
    println(stGrade)


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

//    [start end]
    age = 4
    var endStr = if(age in 1..3){
        println(age)
    }else{
        println("xxx $age")
    }


    when(age){
        4->"4岁"
        5->"5岁"
    }


}