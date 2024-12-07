package kw.part3

import org.example.kw.ful2.add

fun method(vararg arg:Int){
    for (i in arg){
        println(i)
    }
}

//fun method1(vararg arg:Int) = for (num in arg)
fun method1(vararg arg:Int) = println(arg.size)
fun main() {
//    method1(1,3,4,5,6,7)
    method03()
}

fun method03 (){
    fun add(a:Int,b:Int){
        println(a+b)
    }


    add(3,4)

}

fun method04(a:Int,b:Int){
    //存在返回值，需要写类型
    fun(a:Int,b:Int):Int { return a+b;}
}


fun xx():Int {
    return 23;
}