package kw.base.part12.App.jicheng

class JgApp(var name:String,var age:Int) {
    operator fun component1() = name
    operator fun component2() = age

    operator fun plus(other:JgApp) {
        JgApp(name+other.name,age + other.age)
    }
}

fun main(){

    var (name,age) = JgApp("xx",1903)


}