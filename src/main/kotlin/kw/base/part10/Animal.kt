package kw.base.part10

class Animal {
    var _name = "kw"
    var name:String
        set(value){
            _name = value
        }
        get(){
            return _name;
        }
    var sex = "nan"

    var addr = ""
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    var animal = Animal()
    animal.addr

}