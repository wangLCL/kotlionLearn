package kw.base.part15

class Animal() {
    var name:String = ""
        set(value){
            field = value
        }
        get(){
            return field;
        }
    var sex = "nan"

    var addr = ""
        get() = field
        set(value){
            field = value
        }

    var age: Int = 0
        set(value){
            field = value
        }
        get() = field


    fun eat(){
        var x:Int = 0
        x?.inv()
    }

}

fun main() {
    val animal = Animal()
    animal.name = "test"
    println(animal.name)

}
