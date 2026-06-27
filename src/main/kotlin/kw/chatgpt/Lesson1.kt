package kw.chatgpt

fun main() {
    val a = 100;
    var name =  "Tom"
    name = "Jerry"

    var x = 3.14
}


//默认类型非空
//var name:String = null
var name1 :String? = null
var a = null

/**
 * if name! == nll 返回null
 * 不为null ,执行length
 */
var length =  name1?.length

var level2:Int = 0

//level2 = name1?.length

//强制告诉对方部位null
var xx = name1!!.length


var name:String? = null
val text:String? = "kotlin"
val end = text?.substring(0,3)?.length
var name2:String? = "chen"
val leg = name2!!.length

fun add(a:Double,b:Double):Double{
    return a + b
}

fun add(a:Int,b:Int)= a + b

//不带返回值的
fun printSum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}

fun printSum2(a:Int,b:Int){
    println("sum of $a and $b is ${a+b}")
}

//默认参数
fun printSum3(a:Int,b:Int=10){
    println("sum of $a and $b is ${a+b}")
}

//命名参数
fun printSum4(a:Int,b:Int=10){
    println("sum of $a and $b is ${a+b}")
}

fun use(){
    printSum4(b=20,a=30)
}

//表达式写法
fun max(a:Int,b:Int) :Int {
    return if (a>b) b else a
}

fun max2(a:Int,b:Int) = if (a>b) a else b

//练习
fun multiply(a:Int,b:Int):Int{
    return a * b
}

fun multiply2(a:Int,b:Int) = a * b

fun greet(name: String = "Guest") = print("Hello, $name!")

fun greet2(name: String = "Guest") {
    println("Hello, $name!")
}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun isEven2(n: Int) = n % 2 == 0

