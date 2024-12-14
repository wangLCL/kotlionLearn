package kw.base.part21

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

    var endv = arrays.reduce{
                 acc,i-> acc+i
    }
    println(endv)

    var num = 0
    for (item in arrays){
        num += item;
    }
    println(num)

    var listOf = listOf(1, 2, 3, 4, 5)
    listOf.any{
        it > 3 //任何一个大于3
    }
    listOf.all {
        it>3 //所有大于3
    }

}