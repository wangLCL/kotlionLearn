package kw.base.part9

fun main() {
    var listOf:List<Int>? = listOf(1, 2, 3)
//    let 函数能使某个变量作用于其 lambda 表达式里
    var let = listOf(1, 2, 3).first().let {
        it * it
    }
    println(let)
    var str = "xxx"
    str.let {itt->
        println(itt)
    }

    let.apply {
        let.inv()
    }

    var apply = let.apply {
        this.inv()

    }

    listOf = null
    listOf.apply {
        print("---------")
    }?: println("error ===========")


    var run = let.run {
        this.inv()
//        println(this)
        //返回的是含内部执行的类型
    }
    println(run)

    val nameTooLong = with("Polarcubis, Supreme Master of NyetHack") {
        length >= 20
    }
    println(nameTooLong)
}


fun formatGreeting(vipGuest: String?): String {
    return if (vipGuest != null) {
        "Welcome, $vipGuest. Please, go straight back - your table is ready."
    } else {
        "Welcome to the tavern. You'll be seated shortly."
    }
}
