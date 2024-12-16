package kw.base.part2

fun main() {
    //转换需要显式的进行转换
    var num = 10
//    var shortNum: Short = num //类型不匹配
    var shortNumConv: Short = num.toShort() //
    var shortNum: Short = 3
    num = shortNum.toInt()  //不匹配

}