package kw.base.part15

//1️⃣ equals()（内容相等）
//2️⃣ hashCode()（配合集合）
//3️⃣ toString()
//4️⃣ componentN()（解构）
//5️⃣ copy()（复制）
//u1 == u2          // true
//u1 === u2         // false（是否同一个对象）
data class DataKeyWords(
    var name:String,
    var age:Int
)

fun main(args: Array<String>) {
    println(list())
}

fun list() = mapOf(
        "ke1" to 10,
        "ke2" to 30,
        "ke3" to 20
    ).map {
        //具名
        DataKeyWords(name = it.key, age = it.value)
    }.sortedBy {
        it.age
    }.toList();

fun listData(): List<DataKeyWords>? {
    return null;
}