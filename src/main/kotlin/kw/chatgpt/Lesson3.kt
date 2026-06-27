package kw.chatgpt

/**
 * 没有Static ，一切皆是对象
 */
class Lesson3 {

    /**
     * 类内静态替换
     *
     * 可以实现接口
     */
    companion object Lesson3Companion {
        fun test() {
            println("Lesson3Companion test")
        }
    }
}


/*
懒汉式的单例

可以继承
 */
object Lesson3Object {
    fun test() {
        println("Lesson3Object test")
    }
}


/**
 * 单例
 */
object Logger {
    fun log(msg: String) {
        println("Logger: $msg")
    }
}

class User{
    companion object {
        var defaultName:String = "Tom"
    }
}