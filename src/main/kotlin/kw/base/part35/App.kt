package kw.base.part35

enum class App {
    UP,DOWN,LEFT
}

fun main() {
    var up = App.UP;
    when(up){
        App.UP -> println("")
        App.DOWN -> println()
        else->{

        }
    }

    when(up){
        App.UP -> println("")
        App.DOWN -> println("")
        App.LEFT-> println("")
    }

    var toTypedArray = arrayOf(256, 128, 64, 32, 16).map { "tripeaksgdx$it.png" }.toTypedArray()
    toTypedArray.forEach {
        println(it)
    }
    println(toTypedArray::class)

    var p = People()
    p.display()
}


fun People.setV(){
    display()
}