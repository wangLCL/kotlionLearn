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

    //acc上次计算过的值 i是当前值
    var endv = arrays.reduce{
                 acc,i-> acc+i
    }
    println(endv)
    //////////////////////////////////////////////

    var num = 0
    for (item in arrays){
        num += item;
    }
    println(num)

    var listOf = listOf(1, 2, 3, 4, 5)
    //任何一个的满足
    println(listOf.any{
        it > 3 //任何一个大于3
    })
    //所有的值都满足
    println( listOf.all {
        it>3 //所有大于3
    })

    //等于4的有几个
    println( listOf.count{
        it == 4
    })

    println( listOf.max())
    println( listOf.maxBy {
        it
    })

    println( listOf.min())
    println( listOf.minBy { it })
    println( listOf.sum())
    println( listOf.sumBy { it*3 })
    println( listOf.average())
    println( listOf.none{it == 113})








    //从几个开始
    listOf.drop(3).forEach { print(it.toString()+" ") }
    listOf.filterNot { it>3 }.forEach { println(it) }






















}