package kw.base.part9

fun main() {
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



}


fun formatGreeting(vipGuest: String?): String {
    return if (vipGuest != null) {
        "Welcome, $vipGuest. Please, go straight back - your table is ready."
    } else {
        "Welcome to the tavern. You'll be seated shortly."
    }
}
