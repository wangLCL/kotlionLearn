package kw.base.part15

//name是临时变量
class CatAnimal(_name:String,val gender:String) {
    //对于主构造函数中的属性无法这样操作
    var age:Int = 0
        get() = field
        set(value) {field = value}

    var name:String = _name
        get() = field
        set(value) {
            field = value
        }

    constructor(name: String):this(name,"nan")

    override fun toString(): String {
        return "CatAnimal(gender='$gender', age=$age, name='$name')"
    }


}

fun main() {
    var ca = CatAnimal("x")
    ca.name = "xx";
    println(ca)
}