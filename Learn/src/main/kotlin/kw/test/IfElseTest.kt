package kw.test

fun main() {
    val name = "kw"
    val health = 100;

    if (health == 100){
        println("xxxxxxx"+health);
    }else{

    }

    val xx = when(health){
        100->""
        in  88..100->""
        else -> {}
    }

    println("$name  $health")
}
fun add(){

}

//不指定就是公开的
private fun test():Int{
    return 0;
}

//默认参数
public fun add(a:Int = 1,b:Int = 3){
    val v = a + b;
}



//但函数表达式
//public fun add(a:Int,b:Int,c:Int):Int{
//    var v = a + b + c;
//    return v;
//}
//


public fun add(a:Int,b:Int,c:Int):Int=a+b+c;

//unit函数

//没有返回值的函数
//void 这种解决方案无法解释现代语言的一个重要特征：泛型


//具名函数参数

fun test03(){

//传入参数作为参数
//printPlayStatus("NONE",true,"Madrigal")

//    printPlayStatus(aur = "NONE",blend = true,name = "Madrigal") 具名函数参数，可以不关心函数参数的顺序

}

//Nothing类型
//Unit表示没啥返回。
//Nothing类型函数，也不返回任何东西
//唯一相同的  Nothing意味着函数不可能成功执行完成，要不抛出异常，要不某个原因不可返回。
//Nothing有什么用呢？






//深入学习，java中的文件级函数
//java函数和变量都是定义在类中的  kotlin没有这个要求
//kotlin文件级的代码都是静态的，java类名就是kotlin定义所在文件的名字


//深入学习重载
//


//反引号中的函数名
//这是一个特殊的功能

fun `**i am a student**`(){

}

fun iAmAStudent(){

}









































