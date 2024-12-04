package kw.test

class FiveChapter {
    fun test(){
        println(
            {
                val current = 2018
                "well $current"
            }()
        )
    }

    fun test02(){
        //类型
        var gen : ()->String = {
            //string
            "xx"
        }

        println()
        println(gen())
    }

    fun test03(){
        var gen = {
            println("xxx")
        }

        println(gen())
    }

    fun test04(){
        var gen : ()-> String = {
            ""
        }

        var gen1 : (String) -> String = { name ->
            name
        }

        var gen2 : (String) -> String = {
            it
        }

        var gen3 = { name : String ->
            name
        }

    }


}

fun main() {
    var cha = FiveChapter()
    cha.apply {
        test()
        test03()
    }
    cha.test()
    cha.test03()
}

















