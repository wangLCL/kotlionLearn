package kw.part16

/**
 * 继承必须要是open
 */
open class People {
    val name: String? = null
    val age: Int = 0
}

class Student : People(){
    val addr:String?= null

}

fun main() {
    val xx: People = Student()
}