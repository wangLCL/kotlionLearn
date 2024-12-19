package kw.test

import kw.zt.demo.App
import org.example.kw.ful2.add
import java.util.Objects

fun main() {
//    add(1.0,2.0)
    val ed = (arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray())
    for (item in ed){
        println(item)
    }

    val p = People(10).apply {
        eat()
    }

    /**
     * with可以直接调用方法
     */
    with(p){
        eat()
    }

//    println(cc())


    cc({
        //lambda 表达式
            it,n-> {

                println("xx")
            }
    }
    )

}

/**
 * 方法作为参数
 */
fun cc(block: (it:Int,a:Int) -> Unit) {
//    TODO("Not yet implemented")
    println("------------")
    block(10,30)
}

//fun cc():Int = synchronized(Any()){
//    return 3;
//}

//fun cc():Int{
//    return 3;
//}