package kw.part10;

object UserDemo{
    object Singleton {
        val x = 10
    }
}

fun main() {
    UserDemo.Singleton.x
}