package org.example.kw.part3

fun main() {
    //上下类型一致即可
    val score = 75.0
    when(score){
        9.0->{

        }
        8.0,7.0->{

        }
    }

    val level = "优"
    var dec = ""
    when(level){
        "优" -> dec =""
        ""->dec = ""
        ""-> ""
    }

    when{
        level == "优" -> println("===============")
        else -> println("dddddddddddddddd")
    }

    val end = when(level){
        "le" -> {
            ""
        }else->{
            ""
        }
    }

}