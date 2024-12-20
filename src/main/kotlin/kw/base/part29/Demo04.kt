package kw.base.part29

infix fun String?.printErrorInfo(default:String) = println(default)

fun main() {
    var sx:String? = null
    sx.printErrorInfo("error")
    sx printErrorInfo "xxx"  //加上 infix
}