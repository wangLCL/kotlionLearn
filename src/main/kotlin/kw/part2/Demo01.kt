package org.example.kw.part2

fun main() {
//    语句
    var a1 :Int = 10
    var a2 : Int



    val score = 60
    val result = if (score > 100)  "good" else "rbs"
//      必须有else
//    val pj = if (score>10) "x"

    var name = "chen"
//    name = null;  x
    var addr : String? = "北京"
    addr = null
//    Int?是可空类型,可以接受空值
//    不能直接调用可空类型对象的函数或属性。
//    不能把可空类型数据赋值给非空类型变量。
//    不能把可空类型数据传递给非空类型参数的函数。


//    安全调用运算符：?. 安全转换运算符：as?
//    1.可以调用非空类型的函数或属性。
//    2.如果是则不会调用函数或属性，直接返回空值;否则返回调用结果。
//    Elvis运算符：?:
//    非空断言：!!

    //自己无法推断,所以需要指定
    var str:String? = null
    testNull(str)
    str = "xy";
    testNull(str)


//!! 非空断言
//    如果可空类
//    型变量真的为空，则会抛出空指针异常；如果非则可以正常调用函数或属性。
    str = "xy"
    testNullAss(str)
    str = null
//    testNullAss(str)

//    Elvis
    var eName:String? = null
    var en = eName ?: "ao" //相当于给默认值吧
    println(en)
}


fun testNullAss(str: String?) {
    val end = str!!.replace("x","")
    println(end)
}

private fun testNull(str: String?) {
    var replace = str?.replace("x", "")
    println(replace)
}