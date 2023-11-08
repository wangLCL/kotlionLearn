package kw.test

class FiveChapter {
    fun test(){
        println({
            val current = 2018
            "well $current"
        }())
    }

    fun test02(){
        var gen : ()->String = {
            "xx"
        }

        println()
        println(gen())
    }
}

fun main() {
    var cha = FiveChapter()
    cha.test()
    cha.test02()
}