package kw.base.part18

fun calculate(opr:Char) : ((Int, Int) -> Int)? {
    fun add(a:Int,b:Int):Int{
        return a+b
    }

    val result : (Int,Int)->Int =
        when(opr){
            '+'-> ::add
            else ->{ a ,b ->(a/b) }
        }
    return result
}