package kw.base.part12.App

/**
 * 延迟初始化
 */
class LateinitApp {
    lateinit var name :String

    fun ready(){
        name = "kw"
    }

    fun battle(){
        if (::name.isLateinit) println(name)
    }
}