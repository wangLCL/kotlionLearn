package kw.part21

fun main() {

    val arrays = arrayOf(3, 5, 6, 7)
    //过滤函数
    arrays.filter {
        it > 3
    }.forEach {
        println(it)
    }

    //映射
    arrays.map {
        it.toString()+"== "
    }.forEach { println(it) }

    var reduce = arrays.reduce { acc, i ->
        acc + i
    }

    for (i in 0..reduce) {
        println(i)
    }
}