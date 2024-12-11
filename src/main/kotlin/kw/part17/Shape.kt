package kw.part17

/**
 * 默认open
 */
abstract class Shape {
    //抽象属性不需要初始化
    abstract val name:String
    //具体属性
    val type:Int = 1
    //具体方法
    fun display(){

    }

   abstract fun draw();
}