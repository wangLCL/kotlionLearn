package kw.base.part29

fun String.add():String{
    return this+"  测试";
}
fun main() {
    var str = "扩展字符串"
    println(str.add())
    str.myPrint()
}

/**
 * 父类的东西
 */
fun Any.myPrint(){
    print("xxxxxxxxxxxxx")
}