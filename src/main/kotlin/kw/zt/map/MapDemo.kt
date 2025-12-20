package kw.zt.map

fun main() {
    var listOf = listOf<Int>(1, 3, 4, 4, 5, 67, 78, 3)
//    转换为map
    var associateBy = listOf.associateBy { it -> it * 4 }
    for (entry in associateBy) {
        println(""+entry.key +"  --  "+entry.value)
    }


    //不可修改
    val map = mapOf("a" to "a","b" to "b")
    println(map["a"])
    println(map.get("a"))


//    map["a"] = "xx"

    //可修改的
    var maps = mutableMapOf("a" to 3,"b" to 4)

    println(maps["a"])

    maps["a"]  = 6

    println(maps["a"])

    for ((key,value ) in maps){
        println("$key"+"  "+"$value")
    }

}