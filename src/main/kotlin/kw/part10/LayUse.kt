package kw.part10;

class LayUse{
    var name = ""
    val age by lazy {
        10
    }
    lateinit var addr:String
}

fun main() {
    var layUse = LayUse()
    println(layUse.age)
    layUse.addr = "beijing" //延迟初始化
 }