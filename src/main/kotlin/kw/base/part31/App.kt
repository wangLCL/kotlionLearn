package kw.base.part31

fun main() {
    println("main ========== ")
    println(Cat.x)
}

class Cat{
    companion object{
        var x = 0
    }
}