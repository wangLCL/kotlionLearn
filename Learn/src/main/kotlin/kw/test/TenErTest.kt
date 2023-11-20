package kw.test

//类名和文件名一样，也可以不一样  一个文件中可以定义多个类

//定义构造
class TenErTest(agnt : Boolean){
    val agnt = agnt;

    var name ="xx"
        set(value){
            field = value.trim()
        }
        get() = field.capitalize()

    var age = 12
        set(value) {
            field = value
        }
        get() = field;
}






























