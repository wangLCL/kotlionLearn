package kw.base.part10;

data class UserInfo(val name:String,val age : Int)


fun main() {
    val ui = UserInfo("---",12)
    println(ui.name)
    //解构数据类
    val(name) = ui
    val (age) = ui
    println(name)
    //第二个参数不需要解构
    val (name1,_) = ui

}