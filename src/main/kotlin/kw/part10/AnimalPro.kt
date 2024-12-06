package kw.part10

class AnimalPro {
    var age = 10
        set(value){
            field = value
        }
        get() {
            return field
        }
    var name:String? = null
    //延迟初始化
    lateinit var addr:String
}

fun main() {
    var animalPro = AnimalPro()
    animalPro.age = 10
    animalPro.name = "xx"
}