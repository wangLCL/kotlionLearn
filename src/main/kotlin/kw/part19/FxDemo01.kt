package kw.part19
//单类型
private fun isEqualsInt(a:Int,b:Int):Boolean{
    return (a == b)
}

private fun isEqualsDouble(a:Double,b:Double):Boolean{
    return (a == b)
}

public fun <T> isEquals(a:T,b:T):Boolean{
    return (a == b)
}

fun main() {
    println(isEquals(1,4))
}

//多类型
fun <T,U> addRect(a:T,b:U):Boolean{
    return false;
}

