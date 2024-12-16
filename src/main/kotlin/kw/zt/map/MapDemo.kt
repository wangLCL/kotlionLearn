package kw.zt.map

fun main() {
    var listOf = listOf<Int>(1, 3, 4, 4, 5, 67, 78, 3)
//    转换为map
    var associateBy = listOf.associateBy { it -> it * 4 }
    for (entry in associateBy) {
        println(""+entry.key +"  --  "+entry.value)
    }

}