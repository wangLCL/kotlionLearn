package kw.part15

fun Double.interBy(inter:Double):Double{
    return this * inter
}

class Student{
    lateinit var age: String
}


var Student.desc: String
    get(){return ""}
    set(value){
        println(value)
        // 这里不能使用 field，因为扩展属性没有后备字段
        // 你可以在这里执行其他逻辑，比如更新UI、验证输入等
    }
fun main() {
    var num = 1000.0
    var end = num.interBy(2.0)
    println(end)


    var stu = Student()
    stu.desc = "xx"
    println(stu.desc)
}