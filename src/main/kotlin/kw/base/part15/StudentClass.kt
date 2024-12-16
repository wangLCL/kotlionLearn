package kw.base.part15

class StudentClass(_gender:String) {
    var gender = _gender;
    var name:String? = null
        get() = field
        set(value){
            println("xxxxxxxxxxxxxxxxxxx")
            field = value
        }

    val age:Int
        get() = (1..6).shuffled().first()
//        set(value){
//            field = value
//        }

    var add:String = ""
        get() = ""

}

fun main() {
    var sc = StudentClass("男")
    sc.name = "x"
    println(sc.name)
}