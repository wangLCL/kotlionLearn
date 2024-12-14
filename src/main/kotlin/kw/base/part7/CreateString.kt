package kw.base.part7

fun main() {
    create()
//    compare1()
//    compare2()
}

private fun weiys(){
    var i = 10
    var j = 30
    i.inv() //i取反
    println(i and j)

}
private fun suanshu(){
    var num = 2;
    num--
    println(num)

    num++
    println(num)
}

private fun create(): String {
    val bytes = byteArrayOf(23, 34)
    var str1 = String(bytes)
    return str1
}


/**
 * true
 * true
 * false
 */
fun compare2() {
    var str2 = String("kw".toCharArray())
    var str3 = String("kw".toCharArray())
    println(str2.equals(str3)) //比较内容
    println(str2 == str3) //比较内容
    println(str2 === str3) //比较地址

}

private fun compare1() {
    var str2 = "kw"
    var str3 = "kw"
    println(str2.equals(str3)) //比较内容
    println(str2 == str3) //比较内容
    println(str2 === str3) //比较地址
}