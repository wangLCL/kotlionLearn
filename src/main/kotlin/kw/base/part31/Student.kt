package kw.base.part31

object Student {
    init {
        println("初始化 ================== ")
    }
}


class People {
    init {
        println("初始化 ================== ")
    }
}

fun main() {
    for (i in 0..10) {
        var stu = Student
        println(stu)
        var p = People()
        println(p)
    }

}