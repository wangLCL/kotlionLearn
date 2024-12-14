package kw.base.part10

class GzDemo1 constructor(_name:String) {
//    主构造函数
    var name : String
    init {
        name = _name;
    }

}

class GzDemo02  constructor(var name:String){

}

class GzDemo03 (name:String){

}

// 但是存在修饰的时候就不可以省略
class GzDemo04 private constructor(name:String){

}

//存在默认值的
/**
 * var gzDemo05 = GzDemo05();  //可变参数
 */
class GzDemo05 constructor(
    name:String = "",
    age:Int = 19){

}
//由于主构造函数只能有一个，而且初始化时只有init代码块
//******************************
//  次构造函数


class CgzDemo01 {
    constructor(name:String,age:Int){

    }
}

//默认构造

//封装性和可见性


fun main() {
    var gzDemo02 = GzDemo02("k")
    var gzDemo05 = GzDemo05();  //可变参数
}