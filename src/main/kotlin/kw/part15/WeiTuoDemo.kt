package kw.part15

import java.sql.Ref
import kotlin.reflect.KProperty


//class User{
//    lateinit var name:String
//}

//提供委托属性
class WeiTuoDemo {
    var name: String by Delegate()

}


class Delegate() {
    operator fun getValue(thisRef: Any,property:KProperty<*>):String = property.name
    operator fun setValue(thisRef: Any,property: KProperty<*>,value:String){
        println(value)
    }
}