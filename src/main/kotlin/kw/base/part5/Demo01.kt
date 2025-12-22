package kw.base.part5

import java.io.File

/**
 * 匿名函数可以定制一些规则
 */
fun main() {
    val str = "sbddn"
    var count = str.count()
    println(count)

//    次类型的函数作为函数的参数
//    public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) ++count
//        return count
//    }

    /**
     * 实质就是使用匿名函数   函数的作用是传入一个char 返回一个boolean
     */
    fun xx(c:Char):Boolean{

        if (str.contains(c)) {
            return true;
        }
        return false;
    }



    str.count()
    str.count(
    //匿名函数
        {
        letter->
            letter == 's'
    }
    )

    println({
        "ss"
    }())

    //将函数复制给变量
    var gen:()->String = {
        "XXXXXXXX"
    }

    println(gen())

//    lambda 可以让你更灵活地编写应用。然而，灵活也是要付出代价的。
//    在 JVM 上，你定义的 lambda 会以*对象*实例的形式存在。JVM 会为所有同 lambda 打交道的
//    变量分配内存，这就产生了内存开销。更糟的是，lambda 的内存开销会带来严重的性能问题。显
//    然，这种性能问题应当避免。

//    幸运的是，Kotlin 有一种优化机制叫内联，可以解决 lambda 引起的内存开销问题。有了内联，
//    JVM 就不需要使用 lambda 对象实例了，因而避免了变量内存分配。

//    为了使用内联方法优化 lambda，以 inline 关键字标记使用 lambda 的函数即可。如代码清单 5-9
//    所示，

//    哪里需要使用lambda就将代码粘贴到哪里



}


fun showBorad(name:String,gg:(String,Int)->String){
    println(gg("xx",9))
}

fun run(){
    val xx = { name:String,age:Int ->
        "$name $age"
    }
    showBorad("xx",xx)
}

fun showBorad1(name:String,ud:(name:String,age:Int)->String){
    println(ud)
}

fun run1(){
    showBorad1("xx"){
        name, age -> ""
    }
}

fun fileOption(){
    var file = File("").apply {
        setReadable(true)

    }
}

fun letuse(){
    //第一个元素是1  将1传递吃传递给lambda
    listOf(1,2,3,434).first().let {
        println(it)

        it * it  //将最后一行返回
    }

    var name = ""
    name?.let { "" } ?: ""
//    ?: → 如果左边为 null，就使用右边的值。
}
