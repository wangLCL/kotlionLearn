package kw.base.part4

private fun test():Int{
    return 0
}

//不对  不写默认是unit
//private fun test3(){
//    return 0;
//}

private fun test1(){

}

private fun test2():Unit{

}

private fun test4(vararg age:Int){
    for (i in age) {
        println(i)
    }
}

//表达式函数
fun test5(){
    println("xxx")
}

//表达式
fun test6() = println("xxx")

//不对
//fun test7(vararg age:Int) = for(i in age){println(i)}

var test8:(ag:Int) -> String ={"chem"}

var test9:(varargx:Int)->String = {
    println(it)
    ""
}

fun  main1(){
    test9(1)
}

fun method1(){
//    仅限于方法一内部
    fun method2(){
        println("method2")
    }
    method2()
    println("method1")
}


fun rect(width:Float,height:Float):Float{
    return width+height;
}

fun printStr(){
    print("================")
}

fun main():Unit {
//    method1()
//    println("周长：${rect(10.0f,20.0f)}")
//    printStr()
    val name = "a fan da";
    println(name.count())
    println(name.count({ it ->
        it == 's'
    }))


    val bll: (String, Int) -> String = { name,age->
        val xx =  "$name $age"
        xx
    }

    val vs ={
        name:String,age:Int->
        ""
    }

}
