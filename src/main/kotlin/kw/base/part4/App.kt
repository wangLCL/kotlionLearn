package kw.base.part4

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
    printStr()
    return;
}
