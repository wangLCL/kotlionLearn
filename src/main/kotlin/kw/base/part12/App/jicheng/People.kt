package kw.base.part12.App.jicheng

/**
 * 打开
 */
open class People(var name: String)

class Student() : People("") {
    var age:Int = 0
    constructor(age:Int):this(){
        this.age = age;
    }
}