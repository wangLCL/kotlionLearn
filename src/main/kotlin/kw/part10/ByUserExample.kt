package kw.part10

import kotlin.reflect.KProperty

//    Kotlin提供一种委托属性
class User{
    var namex : String by Delegate()
}

class Delegate{
    operator fun getValue(thisRef:Any,property:KProperty<*>):String = property.toString()
    operator fun setValue(thisRef: Any,pro:KProperty<*>,value:String){
        println(value)
    }
}

fun main() {
    var user = User();
    user.namex = "x"
    println(user.namex)
}